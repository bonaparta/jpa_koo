package kooppi;

import javax.persistence.EntityManager;

public class Main2 {
	public static void main(String[] args) {
		User address = new User();
		address.setName("Ha Show");
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(address);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
}
