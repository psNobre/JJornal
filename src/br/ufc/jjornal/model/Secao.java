package br.ufc.jjornal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name ="secao")
public class Secao {
	
	@Id @GeneratedValue
	@Column(name="id")  
	private Integer id;
	
	@Column(name="titulo")  
	private String titulo;
	
	@Column(name="descricao", columnDefinition="text")  
	private String descricao;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="secao") 
	private List<Noticia> noticias;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Noticia> getNoticias() {
		return noticias;
	}
	public void setNoticias(List<Noticia> noticias) {
		this.noticias = noticias;
	}
	
	@Override
	public String toString() {
		return "Session [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}

}
