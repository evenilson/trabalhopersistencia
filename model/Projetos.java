package br.ufc.qxd.persistencia.trabalho_02_jpa.model;

import java.util.List;



//@Entity
//@Table(name = "Projetos")
public class Projetos {
	
	//@Id  
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPro;
	private String nome;
	private String tempoDesenvolvimento;
	//@ManyToMany(mappedBy = "projetos")
	private List<Pesquisador> pesquisador;

	public Projetos() {
	
	}

	public Projetos(int idPro, String nome, String tempoDesenvolvimento, List<Pesquisador> pesquisador) {
		this.idPro = idPro;
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.pesquisador = pesquisador;
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
