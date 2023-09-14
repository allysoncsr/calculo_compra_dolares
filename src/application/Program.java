
/*  
Este programa ele faz o calculo que trás o valor em reais a ser pago na compra de dolares, com a taxa de IOF em 6%.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual valor atual do dolar? $");
		double vDolar = sc.nextDouble();
		
		System.out.print("Quantos dolares você deseja comprar? R$");
		double compra = sc.nextDouble();
		
		double v = calc.conversor(compra, vDolar);
		
		System.out.print("VALOR A SER PAGO EM REAIS: R$" + v);
		
		sc.close();

	}

}
