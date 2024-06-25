package br.com.fiap.challenge_app_parquimetro.service.impl;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import br.com.fiap.challenge_app_parquimetro.repository.DriverRepository;
import br.com.fiap.challenge_app_parquimetro.service.DriverService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DriveServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public DriverDto createDriver(DriverDto driverDto) {
        if(driverRepository.existsByEmail(driverDto.email())) {
            throw new DataIntegrityViolationException("Email already exists: " + driverDto.email());
        }

        //DriverEntity driverEntity = driverRepository.save(toEntity(driverDto));
        return null;
    }



}
