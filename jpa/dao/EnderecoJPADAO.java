package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.EnderecoDAO;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Endereco;

public class EnderecoJPADAO extends GenericJPADAO<Endereco> implements EnderecoDAO  {
	
	public EnderecoJPADAO() {
		super(Endereco.class);
	}
	
}
