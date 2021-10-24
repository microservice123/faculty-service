package com.iuh.faculty.service;

import com.iuh.faculty.entity.Faculty;
import com.iuh.faculty.repository.FacultyRepository;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Basic;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;


    public Faculty saveFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

    @Retry(name = "basic")
    public Faculty findFacultyById(Long id){
        return facultyRepository.findById(id).get();
    }



}
