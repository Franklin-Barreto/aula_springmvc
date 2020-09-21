package org.lanchonete.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Categoria() {}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

}
