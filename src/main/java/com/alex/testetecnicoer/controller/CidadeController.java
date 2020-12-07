package com.alex.testetecnicoer.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.testetecnicoer.dto.CidadeDTO;
import com.alex.testetecnicoer.model.Cidade;
import com.alex.testetecnicoer.response.Response;
import com.alex.testetecnicoer.service.CidadeService;

@RestController
@RequestMapping(value = "cidades")
@CrossOrigin(origins = "*")
public class CidadeController {
	
	private static final Long ID_RIO_GRANDE_DO_SUL = 1L;
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<Response<List<CidadeDTO>>> buscarPorIdEstado(@PathVariable("id") Long id) {
		Response<List<CidadeDTO>> response = new Response<List<CidadeDTO>>();
		List<Cidade> cidades = cidadeService.buscarPorIdEstado(id);
		List<CidadeDTO> cidadesDtos = cidades.stream().map(cidade -> cidade.toDTO()).collect(Collectors.toList());
		response.setData(cidadesDtos);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping
	public ResponseEntity<Response<List<CidadeDTO>>> save(@RequestBody List<CidadeDTO> cidadeDTOs) {
		Response<List<CidadeDTO>> response = new Response<List<CidadeDTO>>();
		List<Cidade> cidades = cidadeDTOs.stream().map(cidade -> cidade.toEntity()).collect(Collectors.toList());
		cidades = cidadeService.salvarEmLote(cidades);
		List<CidadeDTO> cidadesDtos = cidades.stream().map(cidade -> cidade.toDTO()).collect(Collectors.toList());
		response.setData(cidadesDtos);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Response<Object>> remover(@PathVariable("id") Long id) {
		Response<Object> response = new Response<Object>();
		Optional<Cidade> cidade = cidadeService.buscarPorId(id);
		if(cidade.get().getEstado().getId() != ID_RIO_GRANDE_DO_SUL) {
			cidadeService.remover(id);
			return ResponseEntity.ok(response);
		}else {
			response.getErrors().add("Cidades deste estado não podem ser removidas.");
			return ResponseEntity.badRequest().body(response);
		}
		
		
	}

}
