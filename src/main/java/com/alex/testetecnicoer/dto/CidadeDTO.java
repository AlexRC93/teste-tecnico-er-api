package com.alex.testetecnicoer.dto;
import com.alex.testetecnicoer.model.Cidade;
import com.alex.testetecnicoer.model.Estado;

public class CidadeDTO {
	
	private Long id;
	private String descricao;
	private Long idEstado;
	private Long qtdCidadoes;
	
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
	
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	public Long getQtdCidadoes() {
		return qtdCidadoes;
	}
	public void setQtdCidadoes(Long qtdCidadoes) {
		this.qtdCidadoes = qtdCidadoes;
	}
	
	public Cidade toEntity() {
		Cidade cidade = new Cidade();
		cidade.setId(this.id);
		cidade.setDescricao(this.descricao);
		cidade.setEstado(new Estado(this.idEstado));
		cidade.setQtdCidadoes(this.qtdCidadoes);
		return cidade;
	}

}
