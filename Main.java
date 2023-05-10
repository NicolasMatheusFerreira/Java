import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		if (args[0].equals("BinInt")) {
			System.out.println(ConverteBases.isBinInt(args[1]));
		} else if (args[0].equals("IntBin")) {
			System.out.println(ConverteBases.isIntBin(Integer.valueOf(args[1])));
		}
	}
}
