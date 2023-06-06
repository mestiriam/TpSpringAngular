package com.ExamenTP.Services;

import java.util.List;

import com.ExamenTP.entities.Adherant;

public interface IAdhrantService {
	void createAdherant(Adherant adherant);

	List<Adherant> GetAllAdherants();

	Adherant GetAdherantById(Long id);

	void DeleteAdherant(long id);

	void UpdateAdherant(Adherant adherant);

}
