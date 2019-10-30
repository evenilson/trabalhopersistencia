package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.SecretarioDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Secretario;

public class SecretarioJPADAO extends GenericJPADAO<Secretario> implements SecretarioDAO{

	public SecretarioJPADAO() {
		super(Secretario.class);
	}
	
}
