package ATVLa�osDeDecisao;

import java.util.Scanner;

public class ATVla�os1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.;
		int numero=0,x=0,maiorN=0;
		Scanner ler = new Scanner (System.in);
		
		
		for (x=0;x<3;x++) 
		{
			
			System.out.println("entre com o numero: ");
			numero=ler.nextInt();
			
			if(numero>maiorN);
			{
				maiorN=numero;
				
			}
			
		}
		


		System.out.println("o maior numero �:  " + maiorN);

	}

}
