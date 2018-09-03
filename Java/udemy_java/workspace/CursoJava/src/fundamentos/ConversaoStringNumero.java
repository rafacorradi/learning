package fundamentos;

import javax.swing.JOptionPane;

/* Esta op��o serve para que seja poss�vel converter strings num�ricas
 * em n�meros ou n�meros propriamente ditos em string.
 */

public class ConversaoStringNumero {
	public static void main(String[] args) {
		// Exemplo 1 - String para n�mero
		String resposta1 = JOptionPane.showInputDialog("Qual � a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual � a nota 2?");
		
		System.out.println(resposta1 + resposta2);
		
		/* Neste exemplo, o JOptionPane, funcionalidade do pr�prio java
		 * abre um input em que se envia um valor. Ao passarmos n�meros,
		 * o Java receber� duas string num�ricas, por exemplo "6.8" e "7.9".
		 * Desta forma, o print do console ser� a concatena��o de duas strings,
		 * ou "6.87.9".
		 * Para resolver, iremos utilizar o wrapper de double para converter os
		 * dados em n�meros, som�-los e imprimir a m�dia no console.
		 */
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total / 2);
		
		/* Todos os wrappers num�ricos tem suas fun��es de parse, como visto acima,
		 * assim como o boolean.
		 */
		
		// Exemplo 2 - N�mero para string
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
	}
}
