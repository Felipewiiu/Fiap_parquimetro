package br.com.fiap.challenge_app_parquimetro.dto;

import br.com.fiap.challenge_app_parquimetro.usecases.ParkingPeriodType;

import java.time.LocalDateTime;

public record ParkingSessionDto(

        String id,

        String location,

        LocalDateTime startTime,

        LocalDateTime endTime,

        String status,

        ParkingPeriodType parkingPeriod
) {
}
