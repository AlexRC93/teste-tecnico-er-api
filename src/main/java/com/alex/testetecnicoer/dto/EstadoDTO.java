package com.alex.testetecnicoer.dto;

import com.alex.testetecnicoer.model.Estado;

public class EstadoDTO {

	private Long id;
	private String descricao;
	private String bandeira;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public Estado toEntity() {
		Estado estado = new Estado();
		estado.setId(this.id);
		estado.setDescricao(this.descricao);
		estado.setBandeira(this.bandeira);
		return estado;
	}

}
