package projetos;

public class quebraDeLinha {

	public static void main(String[] args) {

		/*
		 * Em Java, print, println e printf são métodos usados para exibir informações
		 * no console, mas com diferenças sutis e importantes:
		 */		
		
		/*
		 * print Significado: imprime o texto sem quebrar linha no final.
		 * 
		 * Uso: mantém o cursor na mesma linha.
		 */
		System.out.print("Olá,");
		System.out.println("Mundo!");
		
		/*SE USAR System.out.println(); OCORRERÁ UMA QUEBRA DE LINHA, 
		PORÉM SE USAR APENAS PRINT SERÁ APENAS IMPRIMIDO NA TELA NA MESMA LINHA*/
		
		/*
		 * println Significado: imprime o texto e quebra a linha no final.
		 * 
		 * Uso: move o cursor para a próxima linha.
		 */
		System.out.println("Olá");
		System.out.println("mundo!");
		
		/*
		 * printf Significado: imprime texto formatado, como em C.
		 * 
		 * Uso: permite inserir variáveis com controle de casas decimais, alinhamento,
		 * etc.
		 */
		double valor = 10.5;
		System.out.printf("O valor é %.2f", valor);
		// Saída: O valor é 10.50

		
	}

}
