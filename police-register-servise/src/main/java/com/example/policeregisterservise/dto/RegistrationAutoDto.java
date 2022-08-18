package com.example.policeregisterservise.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationAutoDto {

    private String model;
    private String brend;
    private String fio_owner;
    private String vin;
    private String autoNumb;
}
