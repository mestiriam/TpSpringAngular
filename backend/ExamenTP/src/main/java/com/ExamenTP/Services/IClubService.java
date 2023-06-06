package com.ExamenTP.Services;

import java.util.List;
import com.ExamenTP.entities.Club;

public interface IClubService {
	void CreateClub(Club club);

	List<Club> GetAllClubs();

	Club GetClubById(Long id);

	void UpdateClub(Club club);

}
