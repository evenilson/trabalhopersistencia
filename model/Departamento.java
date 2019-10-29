package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({
	@NamedQuery(name = "Departamento.findAll", query ="from Departamento"),
})public class Departamento {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departamento_id")
	private int idDepa;
	private String nome;
	
	
	@OneToMany(mappedBy="numeroDepartamento")
	private List<Funcionario> funcionarios;
	
	
	@OneToMany(mappedBy="departamento")
	private List<Projetos> projetos;
	
	public Departamento() {
		
	}

	public Departamento(int idDepa, String nome, List<Funcionario> funcionarios, List<Projetos> projetos) {
		super();
		this.idDepa = idDepa;
		this.nome = nome;
		this.funcionarios = funcionarios;
		this.projetos = projetos;
	}
	public Departamento(String nome) {
		this(0,nome,null,null);
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

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projetos> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Departamento [idDepa=" + idDepa + ", nome=" + nome + ", funcionarios=" + funcionarios + ", projetos="
				+ projetos + "]";
	}
	
	
	
	
}
