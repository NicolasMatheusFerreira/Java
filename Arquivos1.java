import java.util.Scanner;
import java.io.*;

public class Arquivos1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = entrada.nextLine();
		try {
			File arquiv = new File("dados.dat");

			if (!arquiv.canRead())
				System.out.println("O arquivo nao pode ser lido!");
			else {
				FileWriter escritor = new FileWriter(arquiv, true);

				escritor.write(texto);

				escritor.close();
			}
		} catch(IOException e) {
			System.out.println("Erro ao manipular o arquivo");
		}
		entrada.close();
	}
}
