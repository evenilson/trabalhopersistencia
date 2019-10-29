package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.FuncionarioDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Funcionario;
import br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao.*;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioJPADAO() {
		super(Funcionario.class);  
	}

}
