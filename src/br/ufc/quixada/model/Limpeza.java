package br.ufc.quixada.model;

public class Limpeza {
	private String cargo;
	private int jornadaDeTrabalho;
	private boolean gerente;
	
	public Limpeza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Limpeza(String cargo, int jornadaDeTrabalho, boolean gerente) {
		super();
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
		this.gerente = gerente;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}
	public void setJornadaDeTrabalho(int jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	public boolean isGerente() {
		return gerente;
	}
	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}
	@Override
	public String toString() {
		return "Limpeza [cargo=" + cargo + ", jornadaDeTrabalho=" + jornadaDeTrabalho + ", gerente=" + gerente + "]";
	}
	
	

	

}
