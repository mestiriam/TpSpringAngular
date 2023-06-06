package com.ExamenTP.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExamenTP.Repositories.ClubRepository;
import com.ExamenTP.entities.Club;


@Service
public class ClubService implements IClubService{
	@Autowired
	ClubRepository _clubRepository;

	@Override
	public void CreateClub(Club club) {
		_clubRepository.save(club);
		
	}

	@Override
	public List<Club> GetAllClubs() {
		// TODO Auto-generated method stub
		return _clubRepository.findAll();
	}

	@Override
	public Club GetClubById(Long id) {
		// TODO Auto-generated method stub
		return  _clubRepository.findById(id).get();
	}

	@Override
	public void UpdateClub(Club club) {
		// TODO Auto-generated method stub
		_clubRepository.save(club);
		
	}

}
