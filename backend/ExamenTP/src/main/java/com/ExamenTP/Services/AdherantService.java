package com.ExamenTP.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExamenTP.Repositories.AdherantRepository;
import com.ExamenTP.entities.Adherant;


@Service
public class AdherantService implements IAdhrantService{

	@Autowired
	AdherantRepository _adhrantRepository;
	
	@Override
	public void createAdherant(Adherant adherant) {
		// TODO Auto-generated method stub
		_adhrantRepository.save(adherant);
		
	}

	@Override
	public List<Adherant> GetAllAdherants() {
		// TODO Auto-generated method stub
		return _adhrantRepository.findAll();
	}

	@Override
	public Adherant GetAdherantById(Long id) {
		// TODO Auto-generated method stub
		return  _adhrantRepository.findById(id).get();
	}

	@Override
	public void DeleteAdherant(long id) {
		// TODO Auto-generated method stub
		_adhrantRepository.deleteById(id);
	}

	@Override
	public void UpdateAdherant(Adherant adherant) {
		// TODO Auto-generated method stub
		_adhrantRepository.save(adherant);
	}

}
