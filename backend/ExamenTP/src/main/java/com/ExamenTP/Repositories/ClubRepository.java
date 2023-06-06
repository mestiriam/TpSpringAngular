package com.ExamenTP.Repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamenTP.entities.Club;


@Transactional
public interface ClubRepository extends JpaRepository<Club, Long>{

}
