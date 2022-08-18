package com.example.policeregisterservise.controller;

import com.example.policeregisterservise.dto.InsuranceDto;
import com.example.policeregisterservise.servise.PoliceRegistrationFeignServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class InsuranceController {

    @Autowired
    private PoliceRegistrationFeignServise policeRegistrationFeignServise;

    @GetMapping("/hi")
    private String hi() {
        return "It works";
    }

    @GetMapping("/incurance")
    public String show(@RequestParam String vin) {

        LocalDate date = LocalDate.now();
        InsuranceDto show = policeRegistrationFeignServise.show(vin);
        LocalDate insuranceDate = show.getEndDate();

        String s;
        if (insuranceDate.isAfter(date)) {
            s = "Машина зарегистрирована";
        } else {
            s = "В регистрации отказано";
        }

        return s;

    }

}
