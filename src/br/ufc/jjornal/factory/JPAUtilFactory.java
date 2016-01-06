package br.ufc.jjornal.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufc.jjornal.conf.Config;

public class JPAUtilFactory {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory(Config.PERSISTENCE_DB);
	
	public static EntityManager geEntityManager(){
		return ENTITY_MANAGER_FACTORY.createEntityManager();
	}

}
