package fundamentos;

import javax.swing.JOptionPane;

/* Esta opção serve para que seja possível converter strings numéricas
 * em números ou números propriamente ditos em string.
 */

public class ConversaoStringNumero {
	public static void main(String[] args) {
		// Exemplo 1 - String para número
		String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual é a nota 2?");
		
		System.out.println(resposta1 + resposta2);
		
		/* Neste exemplo, o JOptionPane, funcionalidade do próprio java
		 * abre um input em que se envia um valor. Ao passarmos números,
		 * o Java receberá duas string numéricas, por exemplo "6.8" e "7.9".
		 * Desta forma, o print do console será a concatenação de duas strings,
		 * ou "6.87.9".
		 * Para resolver, iremos utilizar o wrapper de double para converter os
		 * dados em números, somá-los e imprimir a média no console.
		 */
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total / 2);
		
		/* Todos os wrappers numéricos tem suas funções de parse, como visto acima,
		 * assim como o boolean.
		 */
		
		// Exemplo 2 - Número para string
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
	}
}
