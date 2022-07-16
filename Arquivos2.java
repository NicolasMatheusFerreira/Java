import java.util.Scanner;
import java.io.*;

public class Arquivos2 {
	public static void main(String[] args) {
		
		final String caminho = "C:\\Users\\nicol\\Documents\\DADOS.dat";

		try {
			File arquiv = new File(caminho);
			FileWriter escritor = new FileWriter(arquiv, true);

			escritor.write("Conteudo escrito no aquivo de teste");

			if (arquiv.exists()) {
				System.out.println("Arquivo existente");
			} else System.out.println("Arquivo nao existente");

			escritor.close();		
		} catch(IOException e) {
			System.out.println("Erro ao escrever o arquivo");
		}
	}
}
