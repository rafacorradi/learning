package fundamentos;
/*
 * Os tipos primitivos s�o os tipos b�iscos de dados
 * que podemos trabalhar no java. S�o 8 no total, sendo
 * 6 s�o num�ricos, 1  destinar � caracteres e 1 booleano.
 * 
 * Os tipos num�ricos s�o divididos em Inteiros e de Ponto
 * Flutuante. Os Inteiros s�o n�meros diretos e os de Ponto
 * Flutuante aceitam casas decimais. Em todos os casos de tipos
 * num�ricos, a difer�n�a entre eles � a capacidade de armazenamento
 * de dados dentro da vari�vel, considerando a quantidade de Bit's.
 * A menor unidade de armazenamento � de 1 byte (8 bit's) e a maior
 * � de 8 bytes (64 bit's).
 * 
 * Os tipos inteiros s�o: Byte, Short, Int e Long.
 * Os tipos Flutuantes s�o: Float e Double.
 */
public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipo Boolean
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);
		
		/* Char - Destinado ao armazenamento de apenas um caractere. 
		 *		  � representado pela letra envolta em aspas simples. 
		 */
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		/* Os n�meros aplicados nas vari�veis abaixo s�o os limites de dados
		 * que podem ser suportados em cada um dos tipos num�ricos. Os underlines 
		 * utilizados nos n�meros grandes, servem apenas como espa�adores visuais.
		 * Seu uso � opcional e ele n�o interfere no valor total do dado.
		 */ 
		// Byte - valor de 1 byte
		byte b = 127;
		
		// Short - valor de 2 bytes
		short s = 32767;
		
		// Int - valor de 4 bytes
		int i = 2_147_483_647;
		
		// Long - valor de 8 bytes
		/* Os n�meros do tipo Long precisam da nota��o L ao final do numeral porque
		 * apesar de serem n�meros inteiros, eles ultrapassam a quantidade de bytes
		 * necess�rios para armazenar um n�mero considerado inteiro e literal. Desta
		 * forma, aplicamos o L ao final para informar o sistema que este n�mero, apesar
		 * de grande, � um inteiro literal, assim como os exemplos acima.
		 */
		long l = 9_223_372_036_854_775_807L;
		
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		
		// Float - valor de 4 bytes
		float f = 3.1416f;
		
		// Double - valor de 8 bytes
		double d = 2.45;
		
		System.out.printf("%f %f\n", f, d);
		
		/* Prints de console apenas para exibir a diferen�a de tamanho de dados entre os tipos
		   num�ricos */
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
	}
}
