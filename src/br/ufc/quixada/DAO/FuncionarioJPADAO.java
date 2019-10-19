package br.ufc.quixada.DAO;

import br.ufc.quixada.JPA.DAO.GenericJPADAO;
import br.ufc.quixada.model.Funcionario;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioJPADAO() {
		super(Funcionario.class);
		
	}

}
