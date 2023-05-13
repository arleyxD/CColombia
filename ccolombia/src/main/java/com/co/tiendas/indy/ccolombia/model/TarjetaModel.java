package com.co.tiendas.indy.ccolombia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class TarjetaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;
	@Column(nullable = false)
	private long idComponente;
	@Column(nullable = false)
	private long idtarjeta;
	@Column(nullable = false)
	private String texto1;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(long idComponente) {
		this.idComponente = idComponente;
	}
	public long getIdtarjeta() {
		return idtarjeta;
	}
	public void setIdtarjeta(long idtarjeta) {
		this.idtarjeta = idtarjeta;
	}
	public String getTexto1() {
		return texto1;
	}
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	
}
