package com.example.mhwt.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name="ActivityLog")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private int sleepHours;
    private int waterIntake; // ml
    private int meditationMinutes;
    private int steps;

    @ManyToOne
    private User user;
}
