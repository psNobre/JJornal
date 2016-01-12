package br.ufc.jjornal.dao.interfaces;

import br.ufc.jjornal.model.Secao;

public interface ISecaoDAO {
	
	public Secao findByTitulo(String titulo);

}
