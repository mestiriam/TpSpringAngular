package com.ExamenTP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ExamenTP.Services.ClubService;
import com.ExamenTP.entities.Club;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class ClubController {
	
	@Autowired
	ClubService _clubService;
	
	@PostMapping("/clubs")
	void createDepartment(@RequestBody Club model) {
		Club club = new Club();
		System.out.println(model.getNom());
		club.setNom(model.getNom());
		_clubService.CreateClub(club);
	}
	
	
	@GetMapping("/clubs")
	List<Club> clubs() {
		return _clubService.GetAllClubs();
	}
	
	@GetMapping("/clubs/{id}")
	Club getOneDepartment(@PathVariable long id) {
		return _clubService.GetClubById(id);
	}

	@PutMapping("/clubs/{id}")
	//void updateClub(@PathVariable long id, @RequestBody DepartmentModel model) {
	void updateClub(@PathVariable long id, @RequestBody Club model) {
		Club club = _clubService.GetClubById(id);
		club.setNom(model.getNom());
		
		_clubService.UpdateClub(club);
	}

}
