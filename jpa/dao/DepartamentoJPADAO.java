package br.ufc.qxd.persistencia.trabalho_02_jpa.jpa.dao;

import br.ufc.qxd.persistencia.trabalho_02_jpa.dao.*;
import br.ufc.qxd.persistencia.trabalho_02_jpa.model.Departamento;;

public class DepartamentoJPADAO  extends GenericJPADAO<Departamento> implements DepartamentoDAO {
	
	public DepartamentoJPADAO() {
		super(Departamento.class);
	}
	
}
