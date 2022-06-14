package com.application.CadastroSmartPhone.controllers;

import javax.validation.Valid;


import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.CadastroSmartPhone.D.SmartphoneD;
import com.application.CadastroSmartPhone.models.SmartphoneData;
import com.application.CadastroSmartPhone.service.SmartphoneService;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cadastrarSmartphone")
public class SmartphoneController {
	
	final SmartphoneService smartphoneService;
	
	public SmartphoneController(SmartphoneService smartphoneService) {
		this.smartphoneService = smartphoneService;
	}
	
    @PostMapping
    public ResponseEntity<Object> CadastroSmartphone(@RequestBody @Valid SmartphoneD smartphoneD){
    	SmartphoneData smartphoneData = new SmartphoneData();
        BeanUtils.copyProperties(smartphoneD, smartphoneData);
        return ResponseEntity.status(HttpStatus.CREATED).body(smartphoneService.save(smartphoneData));
    }
	

}
