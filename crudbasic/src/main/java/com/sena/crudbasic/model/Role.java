package com.sena.crudbasic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name="role")
public class Role {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idRole")
    private int id;

    @Column(name="nameRole")
    private String nameRole;
}
