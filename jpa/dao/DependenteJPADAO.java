package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.DependenteDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Dependentes;

public class DependenteJPADAO extends GenericJPADAO<Dependentes> implements DependenteDAO {

	public DependenteJPADAO() {
		super(Dependentes.class);
		
	}
	
	

}
