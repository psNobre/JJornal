package br.ufc.jjornal.dao.interfaces;

import java.util.List;

import br.ufc.jjornal.model.Papel;

public interface IPapelDAO {
	public void salvar(Papel papel);
	public List<Papel> listarPapeis();

}
