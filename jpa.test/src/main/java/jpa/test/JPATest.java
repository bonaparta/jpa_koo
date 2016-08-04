package jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(); 
//		user.setId(900);//Ä~©ÓUserÃþ§O«á·sŒWžê®Æ
		user.setName("abf");//Ä~©ÓUserÃþ§O«á·sŒWžê®Æ

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa.test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		em.persist(user);		
		tx.commit();
//		user = em.find(table_test.class, 15); //³z¹LId·jŽMSQLžê®Æ
		em.close();
	
//		System.out.println(user.getId());
//		System.out.println(user.getName());
	}

}
