package com.ExamenTP.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity()
@Table(name = "club")
public class Club implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomClub;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nomClub;
	}

	public void setNom(String nom) {
		this.nomClub = nom;
	}

	@JsonBackReference
	@OneToMany(mappedBy = "club",fetch = FetchType.EAGER)
	Collection<Adherant> adherants = new ArrayList<Adherant>();


	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}

	public Collection<Adherant> getAdherants() {
		return adherants;
	}

	public void setAdherants(Collection<Adherant> adherants) {
		this.adherants = adherants;
	}

}
