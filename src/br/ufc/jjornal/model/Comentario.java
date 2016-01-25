package br.ufc.jjornal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="comentario")
public class Comentario {
	
	@Id @GeneratedValue 
	@Column(name="id")  
	private Long id;
	
	@Column(name="texto")
	private String texto;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_user") 
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_noticia") 
	private Noticia noticia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	
	
	
	
	
	

}
