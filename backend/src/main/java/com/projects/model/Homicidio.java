package com.projects.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "homicidios")

public class Homicidio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2395612920022669856L;
	@Id
	private Long id;
	private LocalDate fecha;
	private String departamento;
	private String municipio;
	private String barrio;
	private String zona;			
	private String arma;
	private long cantidad;
	
	
	public Homicidio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public LocalDate getFecha() {
		return fecha;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
