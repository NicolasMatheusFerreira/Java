import java.util.Scanner;
import java.io.*;

public class Arquivos4 {
	public static boolean Write(String caminho, String conteudo) {
		
		try {
			FileWriter arquiv = new FileWriter(caminho);
			PrintWriter escritor = new PrintWriter(arquiv);

			escritor.println(conteudo);
			escritor.close();
			return true;

		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public static void main(String[] args) {
		
	
		String conteudo = "";
		final String caminho = "C:\\Users\\nicol\\desktop\\ARQUIVO.dat";

		Write(caminho, "Nicolas Matheus Ferreira");

		try {
			FileReader arquiv = new FileReader(caminho);
			BufferedReader leitorArquivo = new BufferedReader(arquiv);


			try {
				String linha = "";

				linha = leitorArquivo.readLine();
				while(linha!=null) {
					conteudo += linha;
					linha = leitorArquivo.readLine();
				}
	
				System.out.println(conteudo);

				arquiv.close();
			} catch(IOException ex) {
				System.out.println("Nao foi possivel ler o arquivo");
			}			

		} catch(FileNotFoundException ex) {
			System.out.println("Arquivo nao encontrado");
		}
	}
}
