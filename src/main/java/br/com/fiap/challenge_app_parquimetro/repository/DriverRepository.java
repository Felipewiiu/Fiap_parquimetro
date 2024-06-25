package br.com.fiap.challenge_app_parquimetro.repository;

import br.com.fiap.challenge_app_parquimetro.dto.DriverDto;
import br.com.fiap.challenge_app_parquimetro.entity.DriverEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DriverRepository extends MongoRepository<DriverEntity, String> {

    boolean existsByEmail(String email);
}
