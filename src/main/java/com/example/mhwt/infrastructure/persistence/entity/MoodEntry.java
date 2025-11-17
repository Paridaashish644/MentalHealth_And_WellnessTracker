package com.example.mhwt.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "mood_entry")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MoodEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mood;   // HAPPY | SAD | STRESSED | ANXIOUS | NEUTRAL

    @Column(length = 1000)
    private String note;

    private LocalDate date;

    @ManyToOne
    private User user;
}
