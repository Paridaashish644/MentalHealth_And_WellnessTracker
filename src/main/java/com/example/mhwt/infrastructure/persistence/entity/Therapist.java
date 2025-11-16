package com.example.mhwt.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Therapist")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Therapist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String email;

    private int experienceYears;
}

