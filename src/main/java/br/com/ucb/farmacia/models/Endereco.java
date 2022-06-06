package br.com.ryvvas.farmacia.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;


@Entity
public class Endereco extends PanacheEntity {

	private String logradouro;

}
