package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import br.ufc.qxd.persistencia.trabalho_02_jpa.JPAUtil.JPAUtil;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.GenericDAO;

public class GenericJPADAO<T> implements GenericDAO<T> {

	private Class<T> persistenceClass;

	public GenericJPADAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}

	@Override
	public void save(T t) {
		JPAUtil.getEntityManager().merge(t);
	}

	@Override
	public void delete(T t) {
		JPAUtil.getEntityManager().remove(JPAUtil.getEntityManager().merge(t));
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
	}

	@Override
	public T find(Object id) {
		return JPAUtil.getEntityManager().find(persistenceClass, id);
	}

	@Override
	public List<T> findAll() {
		CriteriaQuery<T> criteriaQuery = JPAUtil.getEntityManager().getCriteriaBuilder().createQuery(persistenceClass);
		criteriaQuery.from(persistenceClass);

		return JPAUtil.getEntityManager().createQuery(criteriaQuery).getResultList();
	}

	@Override
	public void beginTransaction() {
		JPAUtil.beginTransaction();
	}

	@Override
	public void commit() {
		JPAUtil.commit();
	}

	@Override
	public void rollback() {
		JPAUtil.rollback();
	}

	@Override
	public void close() {
		JPAUtil.closeEntityManager();
	}

	@Override
	public void deleteById(Object id) {
		// TODO Auto-generated method stub
		
	}
	

}
