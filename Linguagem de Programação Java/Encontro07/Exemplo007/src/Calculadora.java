
public class Calculadora {

	private double pi, raio;
	
	Calculadora(){
		pi = 3.14;
	}
	
	void setPi(double aux) {
		pi = aux;
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
