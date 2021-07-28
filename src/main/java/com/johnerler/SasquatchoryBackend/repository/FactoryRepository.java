package com.johnerler.SasquatchoryBackend.repository;

import com.johnerler.SasquatchoryBackend.model.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, Integer> {
}
