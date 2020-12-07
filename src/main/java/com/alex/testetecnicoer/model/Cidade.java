package com.alex.testetecnicoer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alex.testetecnicoer.dto.CidadeDTO;

@Entity
@Table(name = "cidade")
@SequenceGenerator(name = "cidade_sequence", sequenceName = "cidade_id_seq", initialValue = 1, allocationSize = 1)
public class Cidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	
	@ManyToOne()
	@JoinColumn(name = "estado_id")
	private Estado estado;
	@Column(name = "qtd_cidadoes", nullable = false)
	private Long qtdCidadoes;
	
	
	
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
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public Long getQtdCidadoes() {
		return qtdCidadoes;
	}

	public void setQtdCidadoes(Long qtdCidadoes) {
		this.qtdCidadoes = qtdCidadoes;
	}
	
	public CidadeDTO toDTO() {
		CidadeDTO cidadeDTO = new CidadeDTO();
		cidadeDTO.setId(this.id);
		cidadeDTO.setDescricao(this.descricao);
		cidadeDTO.setIdEstado(this.estado.getId());
		cidadeDTO.setQtdCidadoes(this.qtdCidadoes);
		return cidadeDTO;
	}

}
