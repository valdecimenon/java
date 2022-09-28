package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static final EntityManagerFactory emf;

	// construtor? N�o
	// m�todo? N�o
	// inicializador est�tico
	static {
		System.out.println("Rodou inicializador est�tico do JpaUtil");
		emf = Persistence.createEntityManagerFactory("editora_pu");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
