package com.duduanan.microservice.authservice;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AuthClientRepository extends MongoRepository<AuthClientDetails, String> {
    Optional<AuthClientDetails> findByClientId(String clientId);
}
