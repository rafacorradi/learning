package fundamentos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		// Operadores: + - * / %
		
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);
		
		/* Cuidado com a precedência. Multiplicação e divisão
		* tem preferência sobre soma e subtração, assim como
		* tudo que estiver entre parênteses é calculado primeiro.
		*
		* Opreador resto % sempre mostra o resto de uma divisão.
		* Muito usado para definir se um número é par ou ímpar.
		*/
	}
}
