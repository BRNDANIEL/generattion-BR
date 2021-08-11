package ATVLaçosDeDecisao;

import java.util.Scanner;

public class ATV3 {

	public static void main(String[] args) {
		// Faça um programa em que permita a entrada de um número qualquer e exiba se este
		//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				//ímpar exiba o número elevado ao quadrado.

		int numero=0;
		double resultado;
		Scanner ler= new Scanner (System.in);
		System.out.println("entre com o numero: ");
		numero=ler.nextInt();
		if (numero%2==0) 
		{
			resultado=Math.sqrt(numero);
			System.out.printf("a raiz quadrada do seu numero par é:%.2f",resultado);
		
		}
				
		else {
			resultado=Math.pow(numero, 2);
			System.out.printf("o quadrado do seu numero impar é:%.2f",resultado);	
		}
	}
	
	
	
	

}
