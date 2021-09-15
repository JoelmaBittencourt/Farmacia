package org.generation.farmaciaa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="produtos")
public class ProdutosModel {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min=5,max=20)
	private String produtos;
	@NotNull
	@Size(min=5,max=50)
	private String descriçao;
	@NotNull
	private double preço;
	
	
@ManyToOne
@JsonIgnoreProperties("produtos")//relaçao entre tabelas
private CategoriaModel categoria;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getProdutos() {
	return produtos;
}


public void setProdutos(String produtos) {
	this.produtos = produtos;
}


public String getDescriçao() {
	return descriçao;
}


public void setDescriçao(String descriçao) {
	this.descriçao = descriçao;
}


public double getPreço() {
	return preço;
}


public void setPreço(double preço) {
	this.preço = preço;
}


public CategoriaModel getCategoria() {
	return categoria;
}


public void setCategoria(CategoriaModel categoria) {
	this.categoria = categoria;
}
}
