package br.ufc.quixada.JPA.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import br.ufc.quixada.DAO.*;
import br.ufc.quixada.JPA.JPAUtil;

public class GenericJPADAO<T> implements GenericDao<T>{
	
	private Class<T> persistenceClass;
	
	public GenericJPADAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}

	@Override
	public void save(T entity) {
		JPAUtil.getEntityManager().merge(entity);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		JPAUtil.getEntityManager().remove(JPAUtil.getEntityManager().merge(entity));
		
	}

	@Override
	public T find(Object id) {
		// TODO Auto-generated method stub
		return JPAUtil.getEntityManager().find(persistenceClass, id);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		CriteriaQuery<T> cq = JPAUtil.getEntityManager().getCriteriaBuilder().createQuery(persistenceClass);
		cq.from(persistenceClass);
		return JPAUtil.getEntityManager().createQuery(cq).getResultList();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		JPAUtil.beginTransaction();
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		JPAUtil.commit();
	}

	@Override
	public void Rooback() {
		// TODO Auto-generated method stub
		JPAUtil.rollback();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
	}

}

