package com.sena.crudbasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name="teacher")
public class Teacher {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idTeacher")
    private int id;

    @Column(name="nameTeacher")
    private String name;

    
}
