package com.springjpa.jpaprogram3.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
//@Table(name="stu")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  //  @Column(name="f_name")
    private String firstName;
    private String lastName;
    private String city;


}


