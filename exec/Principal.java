package br.ufc.qxd.persistencia.trabalho_02_jpa.exec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Departamento;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Projetos;


public class Principal {

	public static void main(String[] args) {
		
		InserirProjeto();
		//InserirDepartamento();
	}

	public static void InserirDepartamento() {
		Departamento c = new Departamento("Jean");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(c);
			/*
			em.persist(new Contato("Sting", "111"));
			em.persist(new Contato("Ronier", "222"));
			em.persist(new Contato("Lucas", "333"));
			em.persist(new Contato("Wesley", "444"));
			 */
			tx.commit();
		} catch(IllegalStateException | PersistenceException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}


		System.out.println("===========================================");

		System.out.println(c);
	}
	
	public static void InserirProjeto() {
		Projetos c = new Projetos("PEP","60Dias");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(c);
			/*
			em.persist(new Contato("Sting", "111"));
			em.persist(new Contato("Ronier", "222"));
			em.persist(new Contato("Lucas", "333"));
			em.persist(new Contato("Wesley", "444"));
			 */
			tx.commit();
		} catch(IllegalStateException | PersistenceException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}


		System.out.println("===========================================");

		System.out.println(c);
	}

}
