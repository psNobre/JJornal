package br.ufc.jjornal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="noticia")
public class Noticia {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private String id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="subtitulo")
	private String subtitulo;
	
	@Column(name="texto")
	private String texto;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_user") 
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_secao") 
	private Secao secao;
	
	/** 
	 * Métodos Getters Setters e toString
	 * */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Secao getSecao() {
		return secao;
	}

	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", subtitulo=" + subtitulo + ", texto=" + texto + "]";
	}
	
	
	

}
