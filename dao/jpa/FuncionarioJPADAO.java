package br.ufc.qxd.dao.jpa;

import br.ufc.qxd.dao.FuncionarioDAO;
import br.ufc.qxd.model.Funcionario;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioJPADAO() {
		super(Funcionario.class);
	}

}
