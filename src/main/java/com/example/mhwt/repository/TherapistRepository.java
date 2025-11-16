package com.example.mhwt.repository;

import com.example.mhwt.infrastructure.persistence.entity.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TherapistRepository extends JpaRepository<Therapist, Long> {
}

