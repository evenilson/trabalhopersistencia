package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Projetos{

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="projeto_id")
	private int idPro;
	private String nome;
	private String tempoDesenvolvimento;

	@ManyToMany
	@JoinTable(
			name="pesquisador_projeto",
			joinColumns=
			@JoinColumn(name="projeto_id", 
			referencedColumnName="projeto_id"),
			inverseJoinColumns =
			@JoinColumn(name="pesquisador_id", 
			referencedColumnName="funcionario_id")
			)
	private List<Pesquisador> pesquisador;
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamento;

	public Projetos() {

	}

	public Projetos(int idPro, String nome, String tempoDesenvolvimento, List<Pesquisador> pesquisador) {
		this.idPro = idPro;
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.pesquisador = pesquisador;
	}

	public Projetos(String nome, String tempoDesenvolvimento) {
		this(0, nome, tempoDesenvolvimento, null);
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTempoDesenvolvimento() {
		return tempoDesenvolvimento;
	}

	public void setTempoDesenvolvimento(String tempoDesenvolvimento) {
		this.tempoDesenvolvimento = tempoDesenvolvimento;
	}

	public List<Pesquisador> getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(List<Pesquisador> pesquisador) {
		this.pesquisador = pesquisador;
	}

	@Override
	public String toString() {
		return "Projetos [idPro=" + idPro + ", nome=" + nome + ", tempoDesenvolvimento=" + tempoDesenvolvimento
				+ ", pesquisador=" + pesquisador + "]";
	}






}
