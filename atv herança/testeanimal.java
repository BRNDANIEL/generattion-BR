package atividades;

public class testeanimal {
 public static void main (String[] args) {
	 doguinho coisa=new doguinho("peludinho",6,"canino","ração","alta","caramelo","vira lata");
	 System.out.println("Nome: "+coisa.getNome()+"\nidade: "+coisa.getIdade() +"\nclasse: "+coisa.getClasse( ));
	 PeDePano picapau=new PeDePano("carpeado",6,"equino","feno","alta","domestico");
	 System.out.println("Nome: "+picapau.getNome()+"\nidade: "+picapau.getIdade() +"\nclasse: "+picapau.getClasse( ));
	 SID many=new SID("megaterio",6,"não sei","planta","alto","preguiça real");
	 System.out.println("Nome: "+many.getNome()+"\nidade: "+many.getIdade() +"\nclasse: "+many.getClasse( ));
 }
 
 

}
