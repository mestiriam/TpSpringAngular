package com.ExamenTP.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//@Entity(name = "adherant")
@Entity()
@Table(name = "adherant")
public class Adherant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomAdherant;
	private String telAdherant;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}


	@ManyToOne(fetch = FetchType.EAGER)
	Club club;

}
