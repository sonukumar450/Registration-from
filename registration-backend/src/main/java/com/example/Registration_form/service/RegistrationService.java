package com.example.Registration_form.service;

import com.example.Registration_form.dto.RegistrationDto;
import com.example.Registration_form.entity.RegistrationEntity;
import com.example.Registration_form.repository.RegistrationRepository;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final RegistrationRepository repository;

    public RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public RegistrationEntity saveRegistration(RegistrationDto dto) {

        RegistrationEntity entity = new RegistrationEntity();

        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setNumber(dto.getNumber());
        entity.setGender(dto.getGender());
        entity.setDob(dto.getDob());
        entity.setCity(dto.getCity());
        entity.setState(dto.getState());
        entity.setPincode(dto.getPincode());
        entity.setAddress(dto.getAddress());

        return repository.save(entity);
    }
}