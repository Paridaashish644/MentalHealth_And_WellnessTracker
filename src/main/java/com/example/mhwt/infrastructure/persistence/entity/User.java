package com.example.mhwt.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String fullName;

    @Column(unique = true)
    private String email;

    private String password;

    private int age;
    private String gender;

    private String role = "USER"; // USER, ADMIN, THERAPIST

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MoodEntry> moodEntries;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Journal> journals;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Habit> habits;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ActivityLog> activityLogs;
}
