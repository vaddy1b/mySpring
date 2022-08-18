package com.example.insurance_register_client.repository;

import com.example.insurance_register_client.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InsuranceRepo extends JpaRepository<Insurance, Long> {

    @Query(nativeQuery = true,value = "SELECT * FROM insurance i WHERE i.vin_code=:vin")
    List <Insurance> listOfVins (String vin);
}
