package com.example.mhwt.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TherapistRequestDto {
    private String name;
    private String specialization;
    private String email;
    private int experienceYears;
}
