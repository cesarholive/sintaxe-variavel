
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		long numeroGrandee = 31232323312312L;  // para números grandes base 64. o L no final é para informar para o eclipse
		                                       //que se trata de um longe, pois o mesmo tendo a atribuir a números o int. 
		short numeroPequeno = 16; // numeros pequenos 16 bits
		byte b = 127; //só vai até 127.
	}
}
