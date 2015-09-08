package br.ufc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="papel")
public class Papel {
	
	@Id @GeneratedValue 
	@Column(name="id")  
	private Long id;
	
	@Column(name="papel")
	private String papel;
	
	@ManyToOne(fetch=FetchType.LAZY) 
	@JoinColumn(name="id_user") 
	private User user;

	/** 
	 * Métodos Getters Setters e toString
	 * */

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getPapel() {
		return papel;
	}



	public void setPapel(String papel) {
		this.papel = papel;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Papel [id=" + id + ", papel=" + papel + ", user=" + user + "]";
	}

	
	
}
