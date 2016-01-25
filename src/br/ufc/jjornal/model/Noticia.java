package br.ufc.jjornal.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="noticia")
public class Noticia {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="subtitulo")
	private String subtitulo;
	
	@Column(name="texto")
	private String texto;
	
	@Column(name="data_noticia")  
	private Timestamp dataNoticia;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_user") 
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_secao") 
	private Secao secao;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="noticia") 
	private List<Comentario> comentarios;
	
	/** 
	 * Métodos Getters Setters e toString
	 * */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
	

	public Timestamp getDataNoticia() {
		return dataNoticia;
	}

	public void setDataNoticia(Timestamp dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", subtitulo=" + subtitulo + ", texto=" + texto + "]";
	}
	
	
	

}
