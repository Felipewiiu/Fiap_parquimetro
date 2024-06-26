package br.com.fiap.challenge_app_parquimetro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {

    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

    public String getEmail() {
        return this.email;
    }
}
