package br.com.fiap.challenge_app_parquimetro.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "driver")
public class DriverEntity {
    @Id
    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

    @DBRef
    private List<VehicleEntity> vehicles;

    @DBRef
    private List<PaymentEntity> payments;
}
