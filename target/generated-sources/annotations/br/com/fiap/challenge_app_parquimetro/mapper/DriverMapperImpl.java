package br.com.fiap.challenge_app_parquimetro.mapper;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-25T21:34:54-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class DriverMapperImpl implements DriverMapper {

    @Override
    public DriverEntity toEntity(DriverDto driverDto) {
        if ( driverDto == null ) {
            return null;
        }

        DriverEntity.DriverEntityBuilder driverEntity = DriverEntity.builder();

        driverEntity.name( driverDto.getName() );
        driverEntity.email( driverDto.getEmail() );
        driverEntity.phone( driverDto.getPhone() );
        driverEntity.address( driverDto.getAddress() );

        return driverEntity.build();
    }

    @Override
    public DriverDto toDto(DriverEntity driverEntity) {
        if ( driverEntity == null ) {
            return null;
        }

        DriverDto driverDto = new DriverDto();

        driverDto.setId( driverEntity.getId() );
        driverDto.setName( driverEntity.getName() );
        driverDto.setEmail( driverEntity.getEmail() );
        driverDto.setPhone( driverEntity.getPhone() );
        driverDto.setAddress( driverEntity.getAddress() );

        return driverDto;
    }
}
