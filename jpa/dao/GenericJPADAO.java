package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import java.util.List;

import br.ufc.qxd.persistencia.trabalho_02_jpa.JPAUtil.JPAutil;
import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.GenericDAO;

public abstract class GenericJPADAO<T> implements GenericDAO<T> {
	
	private Class<T> persistenceClass;
	
	
	
	public GenericJPADAO(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}

	@Override
	public void save(T entity) {
		JPAutil.getEntityManager().merge(entity);
		
	}

	@Override
	public void delete(T entity) {
		JPAutil.getEntityManager().remove(JPAutil.getEntityManager().merge(entity));
		
	}

	@Override
	public void deleteById(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	public Class<T> getPersistenceClass() {
		return persistenceClass;
	}

	public void setPersistenceClass(Class<T> persistenceClass) {
		this.persistenceClass = persistenceClass;
	}
	
	

}
