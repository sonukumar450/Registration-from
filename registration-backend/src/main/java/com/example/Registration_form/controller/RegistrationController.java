package com.example.Registration_form.controller;


import com.example.Registration_form.dto.RegistrationDto;
import com.example.Registration_form.entity.RegistrationEntity;
import com.example.Registration_form.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/registration")
public class RegistrationController {
    private RegistrationService service;

    public RegistrationController(RegistrationService service){
        this.service = service;
    }


    @PostMapping("/save")
    public RegistrationEntity saveRegistration(@RequestBody RegistrationDto dto) {
        return service.saveRegistration(dto);

    }
}