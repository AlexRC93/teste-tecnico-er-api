package com.alex.testetecnicoer.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.testetecnicoer.dto.EstadoDTO;
import com.alex.testetecnicoer.model.Estado;
import com.alex.testetecnicoer.response.Response;
import com.alex.testetecnicoer.service.EstadoService;

@RestController
@RequestMapping(value = "estados")
@CrossOrigin(origins = "*")
public class EstadoController {
	
	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	public ResponseEntity<Response<List<EstadoDTO>>> listar() {
		Response<List<EstadoDTO>> response = new Response<List<EstadoDTO>>();
		List<Estado> estados = estadoService.listar();
		List<EstadoDTO> estadosDtos = estados.stream().map(estado -> estado.toDTO()).collect(Collectors.toList());
		response.setData(estadosDtos);
		return ResponseEntity.ok(response);
	}

}
