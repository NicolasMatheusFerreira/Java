import java.io.*;

public class Arquivos3 {
	public static void main(String[] args) {
				
		File origin = new File("EXEMPLO");
		File destin = new File("TESTE");
		File arquiv = new File(destin+"\\ARQUIVO.txt");

		if (!origin.exists()) {
			if (origin.mkdir()) 
				System.out.println("Diretorio criado com sucesso!");
			else System.out.println("Erro ao criar diretorio");
	
		}

		if (!destin.exists())
			if (origin.renameTo(destin))
				System.out.println("Arquivo renomeado com sucesso");
			else System.out.println("Erro ao renomear o arquivo");
			
		try {
			FileWriter gravador = new FileWriter(arquiv, true);

			gravador.write("CONTEUDO");
			gravador.close();
		} catch(IOException e) {
			System.out.println("Erro ao gravar dados no arquivo!");
		}
		
		System.out.println("O arquivo "+arquiv+" tem um tamanho de "+arquiv.length()+" bytes");
	}
}
