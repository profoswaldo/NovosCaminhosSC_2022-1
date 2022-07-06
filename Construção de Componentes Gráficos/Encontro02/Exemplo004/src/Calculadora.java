
public class Calculadora {

	private double valor1, valor2;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getSoma() {
		return valor1 + valor2;
	}

	public double getSubtracao() {
		return valor1 - valor2;
	}

	public double getMultiplicacao() {
		return valor1 * valor2;
	}

	public double getDivisao() {
		return valor1 / valor2;
	}

}
