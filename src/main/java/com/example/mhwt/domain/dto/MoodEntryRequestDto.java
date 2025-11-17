package com.example.mhwt.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MoodEntryRequestDto {
    private String mood;
    private String note;
    private LocalDate date;
    private Long userId;
}
