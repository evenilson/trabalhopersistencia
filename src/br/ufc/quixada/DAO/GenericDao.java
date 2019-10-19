package br.ufc.quixada.DAO;

import java.util.List;

public interface GenericDao<T> {
	
	public void save(T entity);
	public void delete(T entity);
	public T find(Object id);
	public List<T> findAll();
	public void beginTransaction();
	public void commit();
	public void Rooback();
	public void close();
	
}
