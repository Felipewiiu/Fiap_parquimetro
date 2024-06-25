package br.com.fiap.challenge_app_parquimetro.mapper;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import org.mapstruct.Mapper;

@Mapper
public interface DriverMapper {

    DriverEntity toEntity(DriverDto driverDto);

    DriverDto toDto(DriverEntity driverEntity);
}
