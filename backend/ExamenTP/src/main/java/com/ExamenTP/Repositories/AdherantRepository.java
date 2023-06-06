package com.ExamenTP.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamenTP.entities.Adherant;

@Transactional
public interface AdherantRepository extends JpaRepository<Adherant, Long>{

}
