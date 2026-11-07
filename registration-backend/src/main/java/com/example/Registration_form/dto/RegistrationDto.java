package com.example.Registration_form.dto;


import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter

public class RegistrationDto {

    private String name;
    private String email;
    private String password;
    private String number;
    private String gender;
    private LocalDate dob;
    private String city;
    private String state;
    private String pincode;
    private String address;
}