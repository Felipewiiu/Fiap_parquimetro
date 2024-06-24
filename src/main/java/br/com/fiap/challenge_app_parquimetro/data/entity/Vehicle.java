package br.com.fiap.challenge_app_parquimetro.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Vehicle {
    @Id
    private String id;

    private String licensePlate;

    private String model;

    private String color;

    @DBRef
    private Driver driver;
}
