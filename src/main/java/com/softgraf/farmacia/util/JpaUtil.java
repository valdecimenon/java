package com.softgraf.farmacia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// classe utilitária, a qual acessa persistence.xml para fazer conexão com o banco de dados
public class JpaUtil {

	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory("farmaciaPU");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static void close() {
		factory.close();
	}
}


