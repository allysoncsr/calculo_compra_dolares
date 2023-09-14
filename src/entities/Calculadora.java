package entities;

public class Calculadora {
	
	public final double IOF = 6.0;

	
public double conversor(double compra, double vDolar) {
	double calc = vDolar * compra;
	return calc + (calc * 6 / 100);
}
	
	
}
