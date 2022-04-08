import java.util.Scanner;

public class Fibonacci {
	public int Arranjo(int termo) {
		
		int cont = 2;
		int[] result = new int[termo];

		result[0] = 0;
		result[1] = 1;
		while(cont<termo) {
			result[cont] = result[cont-1]+result[cont-2];
			cont++;
		}
		return result[termo-1];
	}

	public int Iterativo(int termo) {
		
		int a = 0, b = 1, aux, cont = 1;
		System.out.printf("%d %d", a, b);
		while(cont<=termo) {
			aux = a+b;
			if (cont==termo)
				return aux;
			b = a;
			a = aux;
			cont++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Fibonacci fibonacci = new Fibonacci();

		System.out.println(fibonacci.Arranjo(leitura.nextInt()));
	}
}
