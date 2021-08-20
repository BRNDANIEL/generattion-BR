//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.


package ATVarray;

import java.util.Scanner;

public class ARRAY2 {

	public static void main(String[] args) {
		
	int[][] array= new int [3][3];
	int cont=0;
	Scanner ler=new Scanner(System.in);
	
	for(int linha=0;linha<=2;linha++) 
	{
		for(int coluna=0;coluna<=2;coluna++)//int como uma variavel local dentro do for
		{
			System.out.println("entre com um valor: ");
			array[linha][coluna]=ler.nextInt();
			
			if(array[linha][coluna]>10)
			{
			  cont++;
			  
			}
			
			
			
		}
	}
		System.out.println("os valores maiores que 10 são: "+ cont);
	

	}

}
