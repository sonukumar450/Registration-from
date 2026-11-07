package com.example.Registration_form.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "registration")
@Getter
@Setter
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String number;
    private String gender;
    private LocalDate dob;
    private String city;
    private String state;
    private String pincode;

    @Column(length = 1000)
    private String address;
}