package br.ufc.model;

import java.util.List;

public class Papel {
	
	private Long id;
	private String papel;
	private List<User> usuarios;
	
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
	public List<User> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<User> usuarios) {
		this.usuarios = usuarios;
	}
	@Override
	public String toString() {
		return "Papel [id=" + id + ", papel=" + papel + ", usuarios=" + usuarios + "]";
	}
	
	

}
