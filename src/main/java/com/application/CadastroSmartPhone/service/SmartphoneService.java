package com.application.CadastroSmartPhone.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.application.CadastroSmartPhone.models.SmartphoneData;
import com.application.CadastroSmartPhone.repositories.SmartphoneRepository;

@Service
public class SmartphoneService {
	
	final SmartphoneRepository smartphoneRepository;
	
	public SmartphoneService(SmartphoneRepository smartphoneRepository) {
		this.smartphoneRepository = smartphoneRepository;
	}

	@Transactional
	public SmartphoneData save(SmartphoneData smartphoneData) {
		// TODO Auto-generated method stub
		return smartphoneRepository.save(smartphoneData);
	}
}
