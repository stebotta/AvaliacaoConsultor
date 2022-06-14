package com.application.CadastroSmartPhone.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.CadastroSmartPhone.models.SmartphoneData;


  @Repository public interface SmartphoneRepository extends  JpaRepository<SmartphoneData, UUID>{ }
 
 