package br.ufc.jjornal.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="classificado")
public class Classificado {
	
	@Id @GeneratedValue 
	@Column(name="id")  
	private Long id;
	
	@Column(name="titulo")  
	private String titulo;
	
	@Column(name="texto")  
	private String texto;
	
	@Column(name="preco")  
	private Float preco;
	
	@Column(name="telefone")  
	private String telefone;
	
	@Column(name="melhor_oferta")  
	private Float melhorOferta;
	
	@Column(name="data_oferta")  
	private Timestamp dataOferta;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_user") 
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Float getMelhorOferta() {
		return melhorOferta;
	}

	public void setMelhorOferta(Float melhorOferta) {
		this.melhorOferta = melhorOferta;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getDataOferta() {
		return dataOferta;
	}

	public void setDataOferta(Timestamp dataOferta) {
		this.dataOferta = dataOferta;
	}
	

}
