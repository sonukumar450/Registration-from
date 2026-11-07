package com.example.Registration_form.repository;

import com.example.Registration_form.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository
        extends JpaRepository<RegistrationEntity, Long> {

}