package br.com.fiap.challenge_app_parquimetro.entity;

import br.com.fiap.challenge_app_parquimetro.usecases.ParkingPeriodType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

public class ParkingSessionEntity {

    @Id
    private String id;

    @DBRef
    private VehicleEntity vehicle;

    private String location;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private ParkingPeriodType parkingPeriod;

    private String status;

    @DBRef
    private PaymentEntity payment;
}
