import java.util.Scanner;

public class ProgressaoAritmetica {
	
	public static int PA(int x) {
		return (1+x)*x/2;
	}

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println(PA(leitura.nextInt()));
	}
}
