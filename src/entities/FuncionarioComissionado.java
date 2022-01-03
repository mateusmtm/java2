package entities;

public class FuncionarioComissionado {

	private String nome;
	private String cpf;
	private double percentualSobVendas;
	private double totalVendas;
	
	public FuncionarioComissionado(String nome, String cpf, double percentualSobVendas, double totalVendas) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.percentualSobVendas = percentualSobVendas;
		this.totalVendas = totalVendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPercentualSobVendas() {
		return percentualSobVendas;
	}

	public void setPercentualSobVendas(double percentualSobVendas) {
		this.percentualSobVendas = percentualSobVendas;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public double getSalario() {
		return (totalVendas * percentualSobVendas)/100;
	}
	
}
