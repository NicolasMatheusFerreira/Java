import java.util.Scanner;

public class ConverteBases {

	final static int[] potencias = {128, 64, 32, 16, 8, 4, 2, 1};

	public static String isInvert(String palavra) {
		String resultado="";
		for(int i=palavra.length()-1; i>=0; i--) {
			resultado+=palavra.charAt(i);
		}
		return resultado;
	}

	public int QtdCarac(String texto) {
		
            int qtd=1;

            for(int i=0; i<texto.length(); i++) {
                qtd++;			
            }
            return qtd;
	}
        
        public int QtdPalavras(String texto) {
            int j=1;
            String[] palavras = new String[1000];

            for(int i=0; i<texto.length(); i++) {
                if (' '==texto.charAt(i)) {
                    j++;
                } 
            }
		return j;
        }

	public static String isIntBin(int valor) {
		String bits="";

		while(valor>=1) {
			bits+=valor%2;
			valor/=2;
		}
		return isInvert(bits);
	}

	public static int isBinInt(String valor) {
		int i = 0, bit, inteiro = 0; 
		
		while(i<valor.length()) {
			bit = valor.charAt(i) - 48;			
			inteiro+=(bit*Math.pow(2, valor.length()-1-i));
			i++;
		}
		return inteiro;
	}

	public static String isBinCarac(String texto) {
		int cont=0, j=0, soma=0, i=potencias.length;
		String result="";
		
		while (i<=texto.length()) {
			while(cont<i) {
				if (texto.charAt(cont)=='1') {
					soma+=potencias[j];
				}
				j++;
				cont++;
			}
			result+= (char) soma;
			j=0;
			soma=0;
			cont=i+1;
			i+=potencias.length+1;
		}
		return result;
	}

	public static String isCaracBin(String texto) {
		
		int carac, i=0, j=0;
		String result="";

		do {
			j=0;
			carac = texto.charAt(i++);
			while(j<potencias.length) {
				if (carac>=potencias[j]) {
					result+=1;
					carac-=potencias[j];
				} else result+=0;
				j++;
			}
			result+=" ";
		} while(i<texto.length());
		return result;
	}

	public static char isIntCarac(int valor) {
		char carac;
		carac = (char) valor;		
		return carac;
	}

	public static int isCaracInt(char carac) {
		int valor = (int) carac;
		return valor;
	}

	public String isIntOctal(int valor) {
            
		String octal="";

		while(valor>=1) {
			octal+=valor%8;
			valor/=8;
		}
		octal+="0";
		return isInvert(octal);
	}

	public String isOctalInt(String valor) {
		int i = 0, octal, inteiro = 0;
                String result="";
                
               
                while(i<valor.length()) {
               		octal = valor.charAt(i) - 48;			
                        inteiro+=(octal*Math.pow(8, valor.length()-1-i));
                        i++;
               	}

               	return result+=inteiro;     
	}
}
