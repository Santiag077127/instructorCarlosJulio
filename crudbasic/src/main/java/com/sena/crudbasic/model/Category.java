package com.sena.crudbasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name = "category")
public class Category {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idCategory")
    private int id;

    @Column(name = "nameCategory")
    private String name;
}
