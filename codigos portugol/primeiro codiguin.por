programa
{

	funcao inicio()
	{
	
		real mes1,mes2,mes3,media,bonus
		cadeia funcionario
		
		escreva("Nome do funcionario: ")
		leia(funcionario )
		escreva(funcionario+ "digite seu resultado do mes 1: ")
		leia(mes1)
		escreva(funcionario+ "digite seu resultado do mes 2: ")
		leia(mes2)
		escreva(funcionario+ "digite seu resultado do mes 3: ") 
		leia(mes3)
		media = (mes1+mes2+mes3)/3 
		
		escreva("O seu resultado do trimestre é: " + media )
		
		
		bonus = (media /5*10)
		
		
		se (media>=25) {
			escreva( "\n" + "parabéns! você ganhou uma bonificação de " + bonus ) 

}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */