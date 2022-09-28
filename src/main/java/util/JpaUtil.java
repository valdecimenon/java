package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static final EntityManagerFactory emf;

	// construtor? Não
	// método? Não
	// inicializador estático
	static {
		System.out.println("Rodou inicializador estático do JpaUtil");
		emf = Persistence.createEntityManagerFactory("editora_pu");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
