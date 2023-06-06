package com.ExamenTP.models;

public class AdherantModel {
	private Long id;
	private ClubModel club;
	private String nomAdherant;
	public ClubModel getClub() {
		return club;
	}
	public void setClub(ClubModel club) {
		this.club = club;
	}
	private String telAdherant;
	
	public Long getId() {
		return id;
	}
	public String getNomAdherant() {
		return nomAdherant;
	}
	public void setNomAdherant(String nomAdherant) {
		this.nomAdherant = nomAdherant;
	}
	public String getTelAdherant() {
		return telAdherant;
	}
	public void setTelAdherant(String telAdherant) {
		this.telAdherant = telAdherant;
	}
	
}
