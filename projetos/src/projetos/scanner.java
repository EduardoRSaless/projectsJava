package projetos;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			String x;
			System.out.print("Digite uma palavra:" );
			x = sc.next();
			
			System.out.println("Você digitou: " + x);
			
			sc.close();
		
	}

}
