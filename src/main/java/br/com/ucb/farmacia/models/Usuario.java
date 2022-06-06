package br.com.ryvvas.farmacia.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Usuario extends PanacheEntity {

	private String nome;
	private String email;
	private String senha;

}
