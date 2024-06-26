package br.com.fiap.challenge_app_parquimetro.dto;

import br.com.fiap.challenge_app_parquimetro.usecases.ParkingPeriodType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSessionDto {

    private String id;

    private String location;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String status;

    private ParkingPeriodType parkingPeriod;
}

