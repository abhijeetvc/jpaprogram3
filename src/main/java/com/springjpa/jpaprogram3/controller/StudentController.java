package com.springjpa.jpaprogram3.controller;

import com.springjpa.jpaprogram3.model.Student;
import com.springjpa.jpaprogram3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(value="/save")
    public String saveStu(@RequestBody Student student){
        studentRepository.save(student);
        return "Student saved";
    }

    @GetMapping(value="/getstudents")
    public List<Student> getList(){
        return studentRepository.findAll();
    }

    @GetMapping(value="/getstudent/{id}")
    public Optional<Student> getStu(@PathVariable Integer id){
        return studentRepository.findById(id);
    }

    @GetMapping(value="/getstudent/{fname}/{lname}")
    public List<Student> findByFirstNameAndLastName(@PathVariable String fname,
                                                    @PathVariable String lname){
        return studentRepository.findByFirstNameAndLastName(fname,lname);
    }
}
