package com.iuh.faculty.controller;

import com.iuh.faculty.entity.Faculty;
import com.iuh.faculty.service.FacultyService;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    private FacultyService facultyService;


    @PostMapping
    public Faculty saveFaculty(@RequestBody Faculty faculty){
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    public Faculty getFacultyById(@PathVariable("id") Long id){
        return facultyService.findFacultyById(id);
    }

}
