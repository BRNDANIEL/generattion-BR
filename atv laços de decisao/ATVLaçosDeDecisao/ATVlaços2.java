package ATVLa�osDeDecisao;

import java.util.Scanner;

public class ATVla�os2 {

	public static void main(String[] args) {
		// 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
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
			System.out.println("voc� tem idade infantil");
		}
		if(idade >=15 && idade <=17)
		{
			System.out.println("voc� tem idade juvenil");
		}
		if(idade >=18 && idade <=25) {
			System.out.println("voc� tem idade adulta");
			
		}
		
		if(idade <10 ||idade >25) {
			System.out.println("voc� n�o esta em nenhuma categoria listada F");
			
			}
	}
	
	
	
	

}
