package com.examplojpa.projetoJpa2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplojpa.projetoJpa2.entity.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {
		
		// Nenhuma implementação é necessária. Spring Data JPA cuidará disso.
	}



