package com.example.insurance_register_client.servise;

import com.example.insurance_register_client.dto.InsuranceDto;
import com.example.insurance_register_client.entity.Insurance;

public interface InsuranceServise {
    InsuranceDto show(String vin);
}
