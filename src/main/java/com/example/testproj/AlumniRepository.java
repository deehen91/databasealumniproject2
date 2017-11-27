package com.example.testproj;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface AlumniRepository extends CrudRepository<Alumni, Long> {
    Alumni findAllBy(Long Id);

}
