package br.com.fiap.challenge_app_parquimetro.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class Payment {
    @Id
    private String id;

    @DBRef
    private ParkingSession parkingSession;

    private double amount;

    private String paymentMethod;

    private Date paymentTime;

    @DBRef
    private Receipt receipt;
}
