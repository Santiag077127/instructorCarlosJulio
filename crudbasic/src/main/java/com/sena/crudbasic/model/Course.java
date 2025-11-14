package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Course {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idCourse")
    private int id;

    @Column(name="nameCourse")
    private String nombre;

}
