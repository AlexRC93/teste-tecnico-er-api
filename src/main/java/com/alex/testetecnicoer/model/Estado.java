package com.alex.testetecnicoer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alex.testetecnicoer.dto.EstadoDTO;

@Entity
@Table(name = "estado")
@SequenceGenerator(name = "estado_sequence", sequenceName = "estado_id_seq", initialValue = 1, allocationSize = 1)
public class Estado {

	private Long id;
	private String descricao;
	private String bandeira;
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
	public Estado(Long id) {
		this.id = id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name = "bandeira")
	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public EstadoDTO toDTO() {
		EstadoDTO estadoDTO = new EstadoDTO();
		estadoDTO.setId(this.id);
		estadoDTO.setDescricao(this.descricao);
		estadoDTO.setBandeira(this.bandeira);
		return estadoDTO;
	}
	
	
}
