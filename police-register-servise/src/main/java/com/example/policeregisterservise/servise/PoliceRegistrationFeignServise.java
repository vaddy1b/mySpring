package com.example.policeregisterservise.servise;

import com.example.policeregisterservise.dto.InsuranceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "InsuranceController", url = "localhost:8085")
public interface PoliceRegistrationFeignServise {

    @GetMapping("/show")
    InsuranceDto show(@RequestParam String vin);
}
