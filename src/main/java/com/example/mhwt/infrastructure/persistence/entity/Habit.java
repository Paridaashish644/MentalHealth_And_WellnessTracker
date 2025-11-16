package com.example.mhwt.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "habit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String habitName; // Meditation, Reading, Exercise

    private boolean completed;

    private LocalDate date;

    @ManyToOne
    private User user;
}
