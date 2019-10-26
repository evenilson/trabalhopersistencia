package br.ufc.qxd.exec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.ufc.qxd.model.Departamento;

public class Principal {

	public static void main(String[] args) {
		inserir();

	}
	
	public static void inserir() {
		Departamento departamento = new Departamento("RH");
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(new Departamento("RH"));			
			tx.commit();
		}catch( PersistenceException e){
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

		System.out.println("======================================");
		System.out.println(departamento);
		System.out.println("==============FIM - JPA==============");

	}

}
