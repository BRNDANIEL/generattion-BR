package ATVLaçosDeRepetição;

public class ATVrepetição {

	public static void main(String[] args) {
		// 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5. (FOR)

		int numero,resto;
		numero=1000;
		for(numero =1000; numero<2000; numero++) {
			
			if ((numero%11)==5) {
				resto=numero;
				
				System.out.println("\n os numero que atendem a condição proposta são: "+ resto);
			}
		}
		
		
		
		
	}

}
