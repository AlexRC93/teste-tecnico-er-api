package com.alex.testetecnicoer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.testetecnicoer.model.Cidade;
import com.alex.testetecnicoer.model.Estado;
import com.alex.testetecnicoer.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> buscarPorIdEstado(Long id) {
		return cidadeRepository.findByEstado(new Estado(id));
	}
	
	public Optional<Cidade> buscarPorId(Long id) {
		return cidadeRepository.findById(id);
	}
	
	public List<Cidade> salvarEmLote(List<Cidade> cidades) {
		return cidadeRepository.saveAll(cidades);
	}
	
	public void remover(Long id) {
		cidadeRepository.deleteById(id);
	}
	
}
