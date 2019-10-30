package br.ufc.qxd.persistencia.trabalho_02_jpa.controle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.DepartamentoDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.DepartamentoJPADAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Departamento;


public class DepartamentoControle {
	
	public static void InserirDepartamento(String nome) {
		Departamento c = new Departamento();

		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(new Departamento(nome));
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
	
	public static void removerDepartamento(int idDepa) {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();

		try {
			departamentoDAO.beginTransaction();

			departamentoDAO.delete(departamentoDAO.find(idDepa));

			departamentoDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			departamentoDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				departamentoDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Departamento> buscarTodosOsDepartamentos() {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();

		return departamentoDAO.findAll();
	}

	public Departamento buscarDepartamentoPorNumero(int idDepa) {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();

		return departamentoDAO.find(idDepa);
	}

}
