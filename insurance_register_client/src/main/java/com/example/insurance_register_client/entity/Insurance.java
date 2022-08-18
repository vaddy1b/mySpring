package com.example.insurance_register_client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "insurance")
public class Insurance {
    @Id
    @SequenceGenerator(name="insuranceSequence", sequenceName="insurance_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="insuranceSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "vin_code")
    private String vinCode;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

}