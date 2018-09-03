package fundamentos;

/* As conversões de tipos de dados podem ocorrer de duas formas,
 * implicitamente ou explicitamente (cast).
 * Basicamente a diferença das conversões se resume em assumir
 * o risco de perda de dados.
 * 
 * A conversão implicita ocorre quando não existe risco de perder
 * algum tipo de dados, como por exemplo, se passarmos uma variável
 * do tipo int para long, por o long pode conter muito mais dados
 * do que um int.
 * 
 * A conversão explícita ocorre quando tentamos, por exemplo, passar
 * um long para um int. O int contém apenas 4 bytes, em relação ao long,
 * que contém 8. Por este motivo, pode ocorrer uma perda de dados e é
 * necessário assumir este risco.
 * 
 * Para realizar a conversão explicita, declare entre parenteses o novo
 * tipo do dado. 
 */

public class ConversaoNumerica {
	public static void main(String[] args) {
		// Exemplo 1 - Conversão explícita
		
		/* Neste exemplo, temos um valor double 0.1 sendo aplicado em um float
		 * sem declarar um f no final, indicando se tratar de um float. Desta
		 * forma, aplicamos a conversão explícita para que a variável receba o dado.
		 */
		float f = (float) 0.1;
		System.out.println(f);
		
		// Exemplo 2 - Conversão explícita
		
		/* Já neste caso, temos um double sendo inserido em uma variável int.
		 * Desta forma, declaramos a conversão para que o valor seja aceito
		 * e quando este dado for utilizado/ impresso, veremos ele arredondado,
		 * como um número inteiro.
		 */
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// Exemplo 3 - Conversão implícita
		
		/* Este é um exemplo de conversão implícita porque, tecnicamente, todo
		 * caracter contém um valor numérico para o sistema. Desta forma, ao
		 * atribuirmos um caracter à uma variável do tipo int, termos como resultado
		 * esse valor numérico, que é um número inteiro.
		 */
		int i2 = 'a';
		System.out.println(i2);
		
		// Exemplo 4 - Conversão implícita
		
		/* Neste caso, ao passamos um número int em uma variável double, não teremos
		 * perda de dados, apenas será exibida a casa decimal zerada desse número.
		 * Assim, não precisamos declarar a conversão.
		 */
		double d = 1001;
		System.out.println(d);
	}
}
