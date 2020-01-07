package com.duduanan.microservice.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.duduanan.microservice.authservice.entity.AuthClientDetails;

import java.util.Optional;

public interface AuthClientRepository extends MongoRepository<AuthClientDetails, String> {
    Optional<AuthClientDetails> findByClientId(String clientId);
}
