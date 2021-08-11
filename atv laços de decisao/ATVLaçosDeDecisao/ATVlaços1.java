package ATVLaçosDeDecisao;

import java.util.Scanner;

public class ATVlaços1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.;
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
		


		System.out.println("o maior numero é:  " + maiorN);

	}

}
