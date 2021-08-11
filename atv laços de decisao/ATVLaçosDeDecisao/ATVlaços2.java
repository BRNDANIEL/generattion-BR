package ATVLaçosDeDecisao;

import java.util.Scanner;

public class ATVlaços2 {

	public static void main(String[] args) {
		// 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		//categoria ela se encontra:
			// 10-14 infantil
			//15-17 juvenil
			//18-25 adulto
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("entre com sua idade: ");
		idade=ler.nextInt();
		
		if(idade >=10 && idade <=14)
		{
			System.out.println("você tem idade infantil");
		}
		if(idade >=15 && idade <=17)
		{
			System.out.println("você tem idade juvenil");
		}
		if(idade >=18 && idade <=25) {
			System.out.println("você tem idade adulta");
			
		}
		
		if(idade <10 ||idade >25) {
			System.out.println("você não esta em nenhuma categoria listada F");
			
			}
	}
	
	
	
	

}
