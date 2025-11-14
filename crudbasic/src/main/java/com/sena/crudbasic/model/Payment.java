package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity(name="payment")
public class Payment {
    ///Llave Primaria

    @Id

    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="idPayment")
    private String id;

    @Column(name="monto")
    private double monto;
}
