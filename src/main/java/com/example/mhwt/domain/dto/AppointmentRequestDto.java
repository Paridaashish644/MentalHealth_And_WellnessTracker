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
public class AppointmentRequestDto {
    private LocalDate appointmentDate;
    private String status;
    private Long userId;
    private Long therapistId;
}
