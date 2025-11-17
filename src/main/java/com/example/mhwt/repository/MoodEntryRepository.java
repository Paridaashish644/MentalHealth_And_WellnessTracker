package com.example.mhwt.repository;

import com.example.mhwt.infrastructure.persistence.entity.MoodEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MoodEntryRepository extends JpaRepository<MoodEntry, Long> {

    List<MoodEntry> findByUserId(Long userId);

    List<MoodEntry> findByUserIdAndDate(Long userId, LocalDate date);
}

