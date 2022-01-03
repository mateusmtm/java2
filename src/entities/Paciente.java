package entities;

public class Paciente {
	
	private double peso;
	private double altura;
	
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}

	public String diagnostico() {
		if (calcularIMC() > 40.00) {
			return "Obesidade grau III (obesidade mórbida).";
		}else if(calcularIMC() < 39.99 && calcularIMC() > 35.00) {
			return "Obesidade grau II";
		}else if(calcularIMC() < 34.99 && calcularIMC() > 30.00) {
			return "Obesidade grau I";
		}else if(calcularIMC() < 29.99 && calcularIMC() > 25.00) {
			return "Sobrepeso";
		}else if(calcularIMC() < 24.99 && calcularIMC() > 18.50) {
			return "Peso normal";
		}else if(calcularIMC() < 18.49 && calcularIMC() > 17.00) {
			return "Baixo peso";
		}else if(calcularIMC() < 16.99 && calcularIMC() > 16.00) {
			return "Obesidade grau I";
		}
		else {
			return "Baixo peso, muito grave";
		}
	}
	
	
}
