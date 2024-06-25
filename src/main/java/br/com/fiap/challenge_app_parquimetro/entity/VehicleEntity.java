package br.com.fiap.challenge_app_parquimetro.entity;

import org.springframework.data.annotation.Id;

public class VehicleEntity {
    @Id
    private String id;

    private String licensePlate;

    private String model;

    private String color;

}
