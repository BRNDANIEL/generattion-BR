package pacoteATV;

import java.util.Scanner;

public class ATV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segundosE,horas,minutos,segundos;
		Scanner ler = new Scanner (System.in);
		System.out.println("entre com os srgundos totais do evento: ");
		segundosE= ler.nextInt();
		
		horas=segundosE/3600;
	    minutos=(segundosE%3600)/60;
	    segundos=(segundosE%3600)%60;

	   	System.out.println(" O evento durou "+horas+" horas ");
	    System.out.println(minutos + " minutos" );
	    System.out.println(" e "+segundos+" segundos ");
		
		

	}

}
