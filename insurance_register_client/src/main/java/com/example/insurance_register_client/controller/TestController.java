package com.example.insurance_register_client.controller;

import com.example.insurance_register_client.dto.InsuranceDto;
import com.example.insurance_register_client.entity.Insurance;
import com.example.insurance_register_client.repository.InsuranceRepo;
import com.example.insurance_register_client.servise.InsuranceServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class TestController {

    @Autowired
    private InsuranceServise insuranceServise;

    @GetMapping("/show")
    public InsuranceDto show(@RequestParam String vin)
    {
        return insuranceServise.show(vin);
    }



}
