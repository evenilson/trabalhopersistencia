package br.ufc.qxd.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@NamedQueries({
	@NamedQuery(name = "Departamento.findAll", query ="from Departamento"),
	@NamedQuery(name = "Departamento.findByNome",query = "from Departamento d where d.nome = :nome")
})public class Departamento {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDepa;
	private String nome;
	//@OneToMany(mappedBy = "Funcionario")
	//private List<Funcionario> funcionarios;
	//private List<Projetos> projetos;
	
	public Departamento() {
		
	}

	public Departamento(int idDepa, String nome) {
		super();
		this.idDepa = idDepa;
		this.nome = nome;
		//this.funcionarios = funcionarios;
		//this.projetos = projetos;
	}
	
	
	
	public Departamento(String nome) {
		this(0,nome);

	}

	public int getIdDepa() {
		return idDepa;
	}

	public void setIdDepa(int idDepa) {
		this.idDepa = idDepa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento [idDepa=" + idDepa + ", nome=" + nome;
	}
	
	
}
