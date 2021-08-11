package pacoteATV;

import java.util.Scanner;

public class ATV2 {
	public static void main(String[] args) {
		int idade,meses,anos,dias,tdias;
		Scanner ler= new Scanner(System.in);
		System.out.println("entre com o total de dias vividos ");
		tdias=ler.nextInt();
		anos= tdias/365;
		meses=(tdias%365) / 30;
		dias=(tdias%365) % 30;
		System.out.println(" você viveu "+anos+ " anos e "+meses +" meses e "+dias +" dias");
		
		
	}

}
