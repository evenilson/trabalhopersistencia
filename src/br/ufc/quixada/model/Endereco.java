package br.ufc.quixada.model;


public class Endereco extends Funcionario {

	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public Endereco(String rua, int numero, String bairro) {
		this(0, rua, numero, bairro,null);
	}
	
	public Endereco(String rua, int numero, String bairro, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public Endereco(int i, String rua2, int numero2, String bairro2, String cidade2) {
		// TODO Auto-generated constructor stub
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}
	
	

	
	
}
