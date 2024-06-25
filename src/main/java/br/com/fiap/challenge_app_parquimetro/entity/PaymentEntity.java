package br.com.fiap.challenge_app_parquimetro.entity;

import br.com.fiap.challenge_app_parquimetro.usecases.PaymentMethod;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentEntity {
    @Id
    private String id;

    private BigDecimal amount;

    private PaymentMethod paymentMethod;

    private LocalDateTime paymentTime;

}
