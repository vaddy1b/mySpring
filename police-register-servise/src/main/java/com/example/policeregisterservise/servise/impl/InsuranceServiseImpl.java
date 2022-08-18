package com.example.policeregisterservise.servise.impl;

import com.example.policeregisterservise.dto.InsuranceDto;
import com.example.policeregisterservise.servise.InsuranceServise;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class InsuranceServiseImpl implements InsuranceServise {

    @Override
    public Boolean liquidInsurance(InsuranceDto insuranceDto) {
        LocalDate date = LocalDate.now();
        LocalDate insuranceDate = insuranceDto.getEndDate();

        if (insuranceDate.isAfter(date)) {
           return true;
        } else {
           return false;
        }

    }
}
