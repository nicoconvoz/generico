package com.laboratorio.demo.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

@Entity(name = "noticia")
@DiscriminatorColumn(name = "noticia")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Noticia extends Base {
	
	@Column(name = "titulo_de_la_noticia")
	@Length(min=5, max=128)
	private String titulo_de_la_noticia;
	@Column(name = "resumen_de_la_noticia")
	@Length(min=5, max=1024)
	private String resumen_de_la_noticia;
	@Column(name = "imagen_noticia")
	@Length(min=5, max=128)
	private String imagen_noticia;
	@Column(name = "contenido_html")
	@Length(min=5, max=20480)
	private String contenido_html;
	@Column(name = "publicada")
	private char publicada;
	
	@Column(name = "fecha_publicacion")
	@Temporal(TemporalType.DATE)
	private Date fecha_publicacion;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Empresa idEmpresa;
	

	public String getTitulo_de_la_noticia() {
		return titulo_de_la_noticia;
	}

	public void setTitulo_de_la_noticia(String titulo_de_la_noticia) {
		this.titulo_de_la_noticia = titulo_de_la_noticia;
	}

	public String getResumen_de_la_noticia() {
		return resumen_de_la_noticia;
	}

	public void setResumen_de_la_noticia(String resumen_de_la_noticia) {
		this.resumen_de_la_noticia = resumen_de_la_noticia;
	}

	public String getImagen_noticia() {
		return imagen_noticia;
	}

	public void setImagen_noticia(String imagen_noticia) {
		this.imagen_noticia = imagen_noticia;
	}

	public String getContenido_html() {
		return contenido_html;
	}

	public void setContenido_html(String contenido_html) {
		this.contenido_html = contenido_html;
	}

	public char getPublicada() {
		return publicada;
	}

	public void setPublicada(char publicada) {
		this.publicada = publicada;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
}
