import java.util.Scanner;

public class JogoDaVelha {

	public static int Jogo(char[][] Matriz) {
	
		char caractere;
		if (Matriz[0][0]==Matriz[0][2] && Matriz[0][1]==Matriz[0][2]) {
			caractere = Matriz[0][0];
		} else if (Matriz[1][0]==Matriz[1][2] && Matriz[1][1]==Matriz[1][2]) {
			caractere = Matriz[1][0];
		} else if (Matriz[2][0]==Matriz[2][2] && Matriz[2][1]==Matriz[2][2]) {
			caractere = Matriz[2][0];
		} else if (Matriz[0][0]==Matriz[2][0] && Matriz[1][0]==Matriz[2][0]) {
			caractere = Matriz[0][0];
		} else if (Matriz[1][0]==Matriz[2][1] && Matriz[1][1]==Matriz[2][1]) {
			caractere = Matriz[1][0];
		} else if (Matriz[0][2]==Matriz[2][2] && Matriz[1][2]==Matriz[2][2]) {
			caractere = Matriz[0][2];
		} else if (Matriz[0][0]==Matriz[2][2] && Matriz[1][1]==Matriz[2][2]) {
			caractere = Matriz[0][0];
		} else if (Matriz[2][2]==Matriz[0][0] && Matriz[1][1]==Matriz[0][0]) {
			caractere = Matriz[2][2];
		} else caractere = 'v';

		if (caractere=='o') {
			return 1;
		} else if (caractere=='x') {
			return 2;
		} else return 0;
	}
	
	public static void Leitura(char[][] Matriz, Scanner leitura) {
	
		int cont=0;
		for(int i=0; i<Matriz.length; i++) {
			for(int j=0; j<Matriz.length; j++) {
				if (cont%2==0) {
					System.out.printf("Jogador 1: ");
				} else {
					System.out.printf("Jogador 2: ");
				}
				Matriz[i][j] = leitura.nextLine().charAt(0);
				cont++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		char Matriz[][] = new char[3][3];
		int resultado;

		Leitura(Matriz, leitura);
		resultado = Jogo(Matriz);

		if (resultado==1) {
			System.out.println("Jogador 1 e o vencedor! ["+"o"+"]");
		} else if (resultado==2) {
			System.out.println("Jogador 2 e o vencedor! ["+"x"+"]");
		} else System.out.println("Velha");
	}
}
