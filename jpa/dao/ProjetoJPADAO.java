package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.ProjetoDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Projetos;

public class ProjetoJPADAO extends GenericJPADAO<Projetos> implements ProjetoDAO {

	public ProjetoJPADAO() {
		super(Projetos.class);
		
	}
	
	

}
