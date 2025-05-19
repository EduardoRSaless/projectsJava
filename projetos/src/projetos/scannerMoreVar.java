package projetos;
import java.util.Locale;
import java.util.Scanner;
public class scannerMoreVar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y;
		String z;
		char d;
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		System.out.print("Digite um número com casa decimal: ");
		y = sc.nextDouble();
		System.out.print("Digite uma palavra: ");
		z = sc.next();
		System.out.print("Digite uma Letra: ");
		d = sc.next().charAt(0);
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(d);

	}

}
