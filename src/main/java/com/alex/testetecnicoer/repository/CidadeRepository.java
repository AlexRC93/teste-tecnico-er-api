package com.alex.testetecnicoer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.testetecnicoer.model.Cidade;
import com.alex.testetecnicoer.model.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	public List<Cidade> findByEstado(Estado estado);
	

}
