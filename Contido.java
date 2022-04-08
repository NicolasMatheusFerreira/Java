import java.util.Scanner;

public class Contido {
	public String isEntrada(Scanner leitura) {				
		return leitura.nextLine();
	}

	public boolean isContido(String Texto, String Palavra) {

		String aux;
		for(int i=0; i<Texto.length(); i++) {
			aux = "";
			for(int j=i; j<Texto.length(); j++) {
				aux+=Texto.charAt(j);
				if (aux.equals(Palavra)) {
					return true;
				}
			}
		}
		return false;
	}	

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		Contido objeto = new Contido();
			
		if (objeto.isContido(args[0], args[1])==true) {
			System.out.println("Esta contido");
		} else 
			System.out.println("Nao esta contido");
	}
}
