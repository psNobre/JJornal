package br.ufc.jjornal.dao.interfaces;

import java.util.List;

import br.ufc.jjornal.model.Noticia;
import br.ufc.jjornal.model.Secao;

public interface INoticiaDAO {
	
	public List<Noticia> findNoticiasBySecao(Secao secao);

}
