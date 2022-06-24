
public class Calculadora {

	private double pi, raio;
	
	void initPi() {
		pi = 3.14;
	}
	
	double getPi() {
		return pi;
	}
	
	void setRaio(double aux) {
		this.raio = aux;
	}
	
	double getRaio() {
		return raio;
	}
	
	double getPerimetro(){
		return 2 * pi * raio;
	}
	
}
