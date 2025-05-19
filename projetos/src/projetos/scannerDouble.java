package projetos;
import java.util.Scanner;
import java.util.Locale;

public class scannerDouble {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double x;
		System.out.print("Digite um número: ");
		x = sc.nextDouble();
		
		System.out.printf("Você digitou o número: %.1f%n", x);
		
		sc.close();
		
		
	}

}
