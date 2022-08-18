package com.example.insurance_register_client.servise.impl;

import com.example.insurance_register_client.dto.InsuranceDto;
import com.example.insurance_register_client.entity.Insurance;
import com.example.insurance_register_client.repository.InsuranceRepo;
import com.example.insurance_register_client.servise.InsuranceServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceServiseImpl implements InsuranceServise {

    @Autowired
    private InsuranceRepo insuranceRepo;

    @Override
    public InsuranceDto show(String vin) {
        List<Insurance> insurances = insuranceRepo.listOfVins(vin);

        Insurance insurance = insurances.get(0);

        InsuranceDto insuranceDto = new InsuranceDto();

        insuranceDto.setVinCode(insurance.getVinCode());
        insuranceDto.setEndDate(insurance.getEndDate());

        return insuranceDto;
    }
}
