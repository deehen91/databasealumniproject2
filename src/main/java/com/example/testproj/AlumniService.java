package com.example.testproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumniService {
    @Autowired
    AlumniRepository alumniRepository;

    @Autowired
    public AlumniService (AlumniRepository alumniRepository) {
        this.alumniRepository = alumniRepository;
    }

    public Alumni findbyId(Long id) {
        return alumniRepository.findAllBy(id);
    }

    public void saveAlumni(Alumni alumni){
       alumniRepository.save(alumni);
    }
}
