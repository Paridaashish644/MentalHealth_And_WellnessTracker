package com.example.mhwt.repository;

import com.example.mhwt.infrastructure.persistence.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {

    List<ActivityLog> findByUserId(Long userId);

    Optional<ActivityLog> findByUserIdAndDate(Long userId, LocalDate date);
}
