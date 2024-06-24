package br.com.fiap.challenge_app_parquimetro.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class ParkingSession {
    @Id
    private String id;
    @DBRef
    private Vehicle vehicle;

    private String location;

    private Date startTime;

    private Date endTime;

    private long totalTime;

    private String status;

    @DBRef
    private Payment payment;
}
