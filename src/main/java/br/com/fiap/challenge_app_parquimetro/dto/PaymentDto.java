package br.com.fiap.challenge_app_parquimetro.dto;

import br.com.fiap.challenge_app_parquimetro.usecases.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

    private String id;

    private BigDecimal amount;

    private LocalDateTime paymentTime;

    private PaymentMethod paymentMethod;

}
