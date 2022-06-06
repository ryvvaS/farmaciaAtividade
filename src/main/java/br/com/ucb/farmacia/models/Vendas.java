package br.com.ryvvas.farmacia.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Vendas extends PanacheEntity {

	private float valor;
	private int quantidade;
	private boolean isSaida;

}
