package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="[User]")

public class User {

    //anotación bean para id de la entidad
	@Id

	//anotación para autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	//indicar que el campo es una columna
	@Column(name="id_User")
	private int id;

    @Column(name="nameUSer")
    private String name;

}
