package br.ufc.qxd.persistencia.trabalho_02_jpa.dao;

import java.util.List;

public interface GenericDAO<T> {
	public void save(T entity);
	public void delete(T entity);
	public void deleteById(Object id);
	public T find(Object id);
	public List<T> findAll();
	public void beginTransaction();
	public void commit();
	public void rollback();
	public void close();
	void deleteById(Integer id);
}
