package com.example.policeregisterservise.controller;

import com.example.policeregisterservise.dto.RegistrationAutoDto;
import com.example.policeregisterservise.servise.InsuranceServise;
import com.example.policeregisterservise.servise.PoliceRegistrationFeignServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceController {

    @Autowired
    private PoliceRegistrationFeignServise policeRegistrationFeignServise;

    @Autowired
    private InsuranceServise insuranceServise;


    @GetMapping("/hi")
    private String hi() {
        return "It works";
    }

    @GetMapping("/registrationauto")
    public String show(@RequestBody RegistrationAutoDto registrationAutoDto) {

        Boolean result = insuranceServise.liquidInsurance(policeRegistrationFeignServise
                .show(registrationAutoDto.getVin()));
        if (result == false) {
            return "В регистрации отказано";
        }

        registrationAutoDto.getAutoNumb();
        return null;
    }

}
