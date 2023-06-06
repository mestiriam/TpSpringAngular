package com.ExamenTP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExamenTP.Services.AdherantService;
import com.ExamenTP.Services.ClubService;
import com.ExamenTP.entities.Adherant;
import com.ExamenTP.models.AdherantModel;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class AdhrantController {

	@Autowired
	AdherantService _adherantService;
	@Autowired
	ClubService _clubService;

	@PostMapping("/adherants")
	void CreateAdherant(@RequestBody AdherantModel adherantModel) {
		Adherant adherant = new Adherant();
		adherant.setNomAdherant(adherantModel.getNomAdherant());
		adherant.setTelAdherant(adherantModel.getTelAdherant());
		adherant.setClub(_clubService.GetClubById(adherantModel.getClub().getId()));

		_adherantService.createAdherant(adherant);
	}
	
	
	
	@GetMapping("/adherants")
	List<Adherant> GetAllAdherants() {
		return _adherantService.GetAllAdherants();
	}

	@GetMapping("/adherants/{id}")
	Adherant GetAdherantById(@PathVariable long id) {
		return _adherantService.GetAdherantById(id);
	}

	@DeleteMapping("/adherants/{id}")
	void DeleteAdherant(@PathVariable long id) {
		_adherantService.DeleteAdherant(id);
	}

	@PutMapping("/adherants/{id}")
	void UpdateAdherant(@PathVariable long id, @RequestBody AdherantModel adherantModel) {
		Adherant adherant = _adherantService.GetAdherantById(id);
		adherant.setNomAdherant(adherantModel.getNomAdherant());
		adherant.setTelAdherant(adherantModel.getTelAdherant());
		adherant.setClub(_clubService.GetClubById(adherantModel.getClub().getId()));

		_adherantService.UpdateAdherant(adherant);
	}

}
