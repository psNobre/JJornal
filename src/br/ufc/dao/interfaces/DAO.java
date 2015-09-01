package br.ufc.dao.interfaces;

import java.util.List;

public interface DAO<E> {
	
	public E findById(Object id);
	public void salvar(E entidade);
	public void remover(E entidade);
	public List<E> listar();
	public void alterar(E entidade);

}
