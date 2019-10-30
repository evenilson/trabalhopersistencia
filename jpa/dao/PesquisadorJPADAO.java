package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.*;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.*;

public class PesquisadorJPADAO extends GenericJPADAO<Pesquisador> implements PesquisadorDAO {
	
	public PesquisadorJPADAO() {
		super(Pesquisador.class);
	}
	
}
