package com.springjpa.jpaprogram3.repository;

import com.springjpa.jpaprogram3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByFirstNameAndLastName(String fname, String lname);
}
