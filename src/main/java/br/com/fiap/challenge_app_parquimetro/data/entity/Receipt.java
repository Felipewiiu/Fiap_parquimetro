package br.com.fiap.challenge_app_parquimetro.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class Receipt {
    @Id
    private String id;

    @DBRef
    private Payment payment;

    private double amount;

    private Date issuedAt;
}
