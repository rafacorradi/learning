package fundamentos;

/* As convers�es de tipos de dados podem ocorrer de duas formas,
 * implicitamente ou explicitamente (cast).
 * Basicamente a diferen�a das convers�es se resume em assumir
 * o risco de perda de dados.
 * 
 * A convers�o implicita ocorre quando n�o existe risco de perder
 * algum tipo de dados, como por exemplo, se passarmos uma vari�vel
 * do tipo int para long, por o long pode conter muito mais dados
 * do que um int.
 * 
 * A convers�o expl�cita ocorre quando tentamos, por exemplo, passar
 * um long para um int. O int cont�m apenas 4 bytes, em rela��o ao long,
 * que cont�m 8. Por este motivo, pode ocorrer uma perda de dados e �
 * necess�rio assumir este risco.
 * 
 * Para realizar a convers�o explicita, declare entre parenteses o novo
 * tipo do dado. 
 */

public class ConversaoNumerica {
	public static void main(String[] args) {
		// Exemplo 1 - Convers�o expl�cita
		
		/* Neste exemplo, temos um valor double 0.1 sendo aplicado em um float
		 * sem declarar um f no final, indicando se tratar de um float. Desta
		 * forma, aplicamos a convers�o expl�cita para que a vari�vel receba o dado.
		 */
		float f = (float) 0.1;
		System.out.println(f);
		
		// Exemplo 2 - Convers�o expl�cita
		
		/* J� neste caso, temos um double sendo inserido em uma vari�vel int.
		 * Desta forma, declaramos a convers�o para que o valor seja aceito
		 * e quando este dado for utilizado/ impresso, veremos ele arredondado,
		 * como um n�mero inteiro.
		 */
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// Exemplo 3 - Convers�o impl�cita
		
		/* Este � um exemplo de convers�o impl�cita porque, tecnicamente, todo
		 * caracter cont�m um valor num�rico para o sistema. Desta forma, ao
		 * atribuirmos um caracter � uma vari�vel do tipo int, termos como resultado
		 * esse valor num�rico, que � um n�mero inteiro.
		 */
		int i2 = 'a';
		System.out.println(i2);
		
		// Exemplo 4 - Convers�o impl�cita
		
		/* Neste caso, ao passamos um n�mero int em uma vari�vel double, n�o teremos
		 * perda de dados, apenas ser� exibida a casa decimal zerada desse n�mero.
		 * Assim, n�o precisamos declarar a convers�o.
		 */
		double d = 1001;
		System.out.println(d);
	}
}
