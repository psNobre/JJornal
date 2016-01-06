package br.ufc.jjornal.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name = "usuario")
public class User {
	
	@Id
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="user") 
	private List<Papel> papeis;

	/** 
	 * Métodos Getters Setters e toString
	 * */

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", senha=" + senha + ", nome=" + nome + ", email=" + email
				+"]";
	}

	
}