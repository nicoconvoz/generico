package com.laboratorio.demo.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.validator.constraints.Length;

@Entity(name = "empresa")
@DiscriminatorColumn(name = "empresa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Empresa extends Base{
	
	@Column(name = "denominacion")
	@Length(min=5, max=128)
	private String denominacion;
	@Column(name = "telefono")
	@Length(min=5, max=50)
	private String telefono;
	@Column(name = "horario_de_atencion")
	@Length(min=5, max=256)
	private String horario_de_atencion;
	@Column(name = "quienes_somos")
	@Length(min=5, max=1024)
	private String quienes_somos;
	@Column(name = "latitud")
	private double latitud;
	@Column(name = "longitud")
	private double longitud;
	@Column(name = "domicilio")
	@Length(min=5, max=256)
	private String domicilio;
	@Column(name = "email")
	@Length(min=5, max=75)
	private String email;
	
	
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getHorario_de_atencion() {
		return horario_de_atencion;
	}
	public void setHorario_de_atencion(String horario_de_atencion) {
		this.horario_de_atencion = horario_de_atencion;
	}
	public String getQuienes_somos() {
		return quienes_somos;
	}
	public void setQuienes_somos(String quienes_somos) {
		this.quienes_somos = quienes_somos;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
