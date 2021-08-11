package pacoteATV;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0,meses,dias;
		Scanner ler = new Scanner (System.in);
		System.out.println("entre com o a sua idade: ");
		idade = ler.nextInt();
		meses=idade*12;
		dias=meses*30;
		System.out.println("você tem "+ dias + " dias de vida");
		
		
		
		
		

	}

}
