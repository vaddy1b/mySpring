package com.example.insurance_register_client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceDto {

    private String vinCode;

    private LocalDate endDate;


}
