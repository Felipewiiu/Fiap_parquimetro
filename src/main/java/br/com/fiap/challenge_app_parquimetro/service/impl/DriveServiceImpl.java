package br.com.fiap.challenge_app_parquimetro.service.impl;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import br.com.fiap.challenge_app_parquimetro.mapper.DriverMapper;
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

    @Autowired
    private DriverMapper driverMapper;

    @Override
    public DriverDto createDriver(DriverDto driverDto) {
        if(driverRepository.existsByEmail(driverDto.getEmail())) {
            throw new DataIntegrityViolationException("Email already exists: " + driverDto.getEmail());
        }

        DriverEntity driverEntity = driverMapper.toEntity(driverDto);

        DriverEntity savedDriverEntity = driverRepository.save(driverEntity);

        DriverDto savedDriverDto = driverMapper.toDto(savedDriverEntity);

        return savedDriverDto;
    }

}
