package projetos;

import java.util.Locale;

public class variavelDouble {

	public static void main(String[] args) {

		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		System.out.println("Resultado = " +  x + " Metros ");
		System.out.printf("Resultado =  %.2f metros%n", x);


		
		/*
		 * Em Java, double é um tipo primitivo que representa um número decimal de
		 * precisão dupla (ou seja, com mais casas decimais que o float).
		 * 
		 * Resumo do significado de double em Java: Tipo de dado: primitivo.
		 * 
		 * Tamanho: 64 bits.
		 * 
		 * Faixa de valores: aproximadamente de ±4.9×10⁻³²⁴ a ±1.8×10³⁰⁸.
		 * 
		 * Precisão: cerca de 15 casas decimais.
		 * 
		 * Uso: para cálculos com números decimais que exigem mais precisão que float.
		 */
		/*
		 * o %n → É uma quebra de linha (igual ao \n, mas mais portátil entre sistemas
		 * operacionais).
		 * f → tipo de dado: número decimal (float ou double).
		 * .2 → define 2 casas decimais.
		 * .4 → define 4 casas decimais.
		 * Se o número tiver mais de 2 casas decimais, o printf:
		 * → arredonda para cima se a 3ª casa for 5 ou mais.
		 * → arredonda para baixo se for menor que 5.
		 * 
		 */

	}

}
