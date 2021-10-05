package com.iuh.faculty.service;

import com.iuh.faculty.entity.Faculty;
import com.iuh.faculty.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

    public Faculty findFacultyById(Long id){
        return facultyRepository.findById(id).get();
    }
}
