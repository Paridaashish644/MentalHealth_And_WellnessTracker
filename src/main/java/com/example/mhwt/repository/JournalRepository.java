package com.example.mhwt.repository;

import com.example.mhwt.infrastructure.persistence.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {

    List<Journal> findByUserId(Long userId);

    Optional<Journal> findByUserIdAndDate(Long userId, LocalDate date);
}

