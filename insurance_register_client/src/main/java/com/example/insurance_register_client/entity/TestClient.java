package com.example.insurance_register_client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "test_client")
public class TestClient {

    @Id
    @SequenceGenerator(name="test_clientSequence", sequenceName="test_client_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="test_clientSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "insurance_numb")
    private Long insuranceNumb;

    @Column(name = "name_user")
    private String nameUser;


}
