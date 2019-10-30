package br.ufc.qxd.persistencia.trabalho_02_jpa.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("dev");

	private static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();

	public static EntityManager getEntityManager() {
		EntityManager entityManager = threadLocal.get();

		if (entityManager == null) {
			entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
			threadLocal.set(entityManager);
		}

		return entityManager;
	}

	public static void beginTransaction() {
		getEntityManager().getTransaction().begin();
	}

	public static void commit() {
		EntityTransaction entityTransaction = getEntityManager().getTransaction();

		if (entityTransaction.isActive())
			entityTransaction.commit();
	}

	public static void rollback() {
		EntityTransaction entityTransaction = getEntityManager().getTransaction();

		if (entityTransaction.isActive())
			entityTransaction.rollback();
	}

	public static void closeEntityManager() {
		EntityManager entityManager = threadLocal.get();

		if (entityManager != null) {
			EntityTransaction tx = entityManager.getTransaction();

			if (tx.isActive()) {
				tx.commit();
			}

			entityManager.close();
			threadLocal.set(null);
		}
	}
}

