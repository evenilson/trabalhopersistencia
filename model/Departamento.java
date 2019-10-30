package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotNull;


@Entity
public class Departamento {
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="departamento_id")
	private int idDepa;
	
	@NotNull
	private String nome;
	
	
	@OneToMany(mappedBy="numeroDepartamento")
	private List<Funcionario> funcionarios;
	
	
	@OneToMany(mappedBy="departamento")
	private List<Projetos> projetos;
	
	public Departamento() {
		
	}

	public Departamento(int idDepa) {
		this.idDepa = idDepa;
	}

	public Departamento(String nome) {
		this.nome = nome;
	}

	public Departamento(int idDepa, String nome) {
		this.idDepa = idDepa;
		this.nome = nome;
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
		return "Departamento [idDepa=" + idDepa + ", nome=" + nome + "]";
	}
	
	
	
	
	
	
}
