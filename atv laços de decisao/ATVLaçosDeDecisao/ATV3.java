package ATVLa�osDeDecisao;

import java.util.Scanner;

public class ATV3 {

	public static void main(String[] args) {
		// Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
				//�mpar exiba o n�mero elevado ao quadrado.

		int numero=0;
		double resultado;
		Scanner ler= new Scanner (System.in);
		System.out.println("entre com o numero: ");
		numero=ler.nextInt();
		if (numero%2==0) 
		{
			resultado=Math.sqrt(numero);
			System.out.printf("a raiz quadrada do seu numero par �:%.2f",resultado);
		
		}
				
		else {
			resultado=Math.pow(numero, 2);
			System.out.printf("o quadrado do seu numero impar �:%.2f",resultado);	
		}
	}
	
	
	
	

}
