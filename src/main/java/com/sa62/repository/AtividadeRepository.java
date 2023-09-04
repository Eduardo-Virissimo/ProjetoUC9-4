package com.sa62.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa62.models.Atividade;


@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Long> { 
	
	Iterable<Atividade> findById(int id);
	
}

