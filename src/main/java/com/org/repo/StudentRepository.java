package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
