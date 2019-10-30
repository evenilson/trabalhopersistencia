package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.*;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.*;

public class LimpezaJPADAO extends GenericJPADAO<Limpeza> implements LimpezaDAO {

	public LimpezaJPADAO() {
		super(Limpeza.class);
	}	
	
}
