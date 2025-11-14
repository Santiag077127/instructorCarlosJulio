package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="lesson")

public class Lesson {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idLesson")
    private int id;

    @Column(name="nameLesson")
    private String name;
}
