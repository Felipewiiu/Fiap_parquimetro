package br.com.fiap.challenge_app_parquimetro.data.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Driver {
    @Id
    private String id;

    private String name;

    private String email;

    private String phone;

    private List<Vehicle> vehicles;
}
