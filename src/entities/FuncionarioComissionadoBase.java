package entities;

public class FuncionarioComissionadoBase extends FuncionarioComissionado {
	
	private double valorBase;

	public FuncionarioComissionadoBase(String nome, String cpf, double percentualSobVendas, double totalVendas, double valorBase) {
		super(nome, cpf, percentualSobVendas, totalVendas);
		this.valorBase = valorBase;
	}
	
	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public double getSalario() {
		return super.getSalario() + valorBase;
	}

	
}
