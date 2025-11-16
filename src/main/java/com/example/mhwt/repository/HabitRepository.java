package com.example.mhwt.repository;

import com.example.mhwt.infrastructure.persistence.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {

    List<Habit> findByUserId(Long userId);

    List<Habit> findByUserIdAndDate(Long userId, LocalDate date);
}
