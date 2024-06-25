package br.com.fiap.challenge_app_parquimetro.dto;

import br.com.fiap.challenge_app_parquimetro.usecases.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PaymentDto(

        String id,

        BigDecimal amount,

        LocalDateTime paymentTime,

        PaymentMethod paymentMethod
) {
}
