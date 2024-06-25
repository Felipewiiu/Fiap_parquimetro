package br.com.fiap.challenge_app_parquimetro.controller;


import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.service.DriverService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
@AllArgsConstructor
public class DriverController {

    private DriverService driverService;

    @PostMapping()
    public ResponseEntity<DriverDto> createDriver(@RequestBody DriverDto driver) {
        DriverDto createDriver = driverService.createDriver(driver);
        return new ResponseEntity<>(createDriver, HttpStatus.CREATED);

    }


}
