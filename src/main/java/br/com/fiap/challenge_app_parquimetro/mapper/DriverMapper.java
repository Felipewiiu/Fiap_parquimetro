package br.com.fiap.challenge_app_parquimetro.mapper;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    @Mapping(target = "vehicles", ignore = true)
    @Mapping(target = "payments", ignore = true)
    @Mapping(target = "id", ignore = true)
    DriverEntity toEntity(DriverDto driverDto);

    DriverDto toDto(DriverEntity driverEntity);
}
