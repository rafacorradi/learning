package fundamentos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		// Operadores: + - * / %
		
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);
		
		/* Cuidado com a preced�ncia. Multiplica��o e divis�o
		* tem prefer�ncia sobre soma e subtra��o, assim como
		* tudo que estiver entre par�nteses � calculado primeiro.
		*
		* Opreador resto % sempre mostra o resto de uma divis�o.
		* Muito usado para definir se um n�mero � par ou �mpar.
		*/
	}
}
