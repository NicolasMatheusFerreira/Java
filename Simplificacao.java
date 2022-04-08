import java.util.Scanner;

public class Simplificacao {

	public static int valor_1, valor_2;

	public static void Entrada(Scanner leitura) {

		int j = 0;
		String vlr_1 = "", vlr_2 = "";
		String expressao = leitura.nextLine();

		expressao = leitura.nextLine();

		while(expressao.charAt(j)!='/') {
			vlr_1+=expressao.charAt(j++);
		}

		j++;

		while(j<expressao.length()) {
			vlr_2+=expressao.charAt(j++);
		}
		valor_1 = Integer.parseInt(vlr_1);
		valor_2 = Integer.parseInt(vlr_2);
	}

	public static int MenorValor(int valor_1, int valor_2) {

		if (valor_1<valor_2) {
			return valor_1;
		} else {
			return valor_2;
		}
	}

	public static String Fatoracao(int valor_1, int valor_2) {

		int i = 2;

		while(i<=MenorValor(valor_1, valor_2)) {
			if (valor_1%i==0 && valor_2%i==0) {
				valor_1/=i;
				valor_2/=i;
			} else i = i+1;
		}

		return valor_1+"/"+valor_2;
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int cont=0, qtdOperacoes;

		System.out.printf("Informe a quantidade de operacoes: ");
		qtdOperacoes = leitura.nextInt();

					// Entrada de dados

		while(cont++<qtdOperacoes) {

			System.out.printf("Simplificacao! \n");
			Entrada(leitura);
			System.out.println("A simplificacao e igual a "+Fatoracao(valor_1, valor_2));
		}
		System.out.println("Fim...!");
	}
}
