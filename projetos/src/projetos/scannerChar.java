package projetos;

import java.util.Scanner;

public class scannerChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x;
		System.out.print("Digite uma letra: ");
		x = sc.next().charAt(0);
		
		System.out.println("Você digitou a letra: " + x);
		
	}

}
