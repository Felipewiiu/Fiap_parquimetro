package br.com.fiap.challenge_app_parquimetro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {

    private String id;

    private String licensePlate;

    private String model;

    private String color;

}
