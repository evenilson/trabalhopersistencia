package br.ufc.quixada.exec;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.ufc.quixada.model.Funcionario;
import br.ufc.quixada.model.Pesquisador;

public class Principal {
	public static void main(String[] args) {
		inserir();
	}
	
	public static void inserir() {
		Pesquisador F = new Pesquisador("teste","teste","M", "10-20-2001","teste");
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(F);
			tx.commit();
		}catch( PersistenceException e){
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

		System.out.println("======================================");
		System.out.println(F);
		System.out.println("==============FIM - JPA==============");

	}

}
