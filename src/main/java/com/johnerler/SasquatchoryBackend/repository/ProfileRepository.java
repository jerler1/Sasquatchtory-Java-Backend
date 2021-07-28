package com.johnerler.SasquatchoryBackend.repository;


import com.johnerler.SasquatchoryBackend.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
