package fundamentos;
/*
 * Os tipos primitivos são os tipos báiscos de dados
 * que podemos trabalhar no java. São 8 no total, sendo
 * 6 são numéricos, 1  destinar à caracteres e 1 booleano.
 * 
 * Os tipos numéricos são divididos em Inteiros e de Ponto
 * Flutuante. Os Inteiros são números diretos e os de Ponto
 * Flutuante aceitam casas decimais. Em todos os casos de tipos
 * numéricos, a diferênça entre eles é a capacidade de armazenamento
 * de dados dentro da variável, considerando a quantidade de Bit's.
 * A menor unidade de armazenamento é de 1 byte (8 bit's) e a maior
 * é de 8 bytes (64 bit's).
 * 
 * Os tipos inteiros são: Byte, Short, Int e Long.
 * Os tipos Flutuantes são: Float e Double.
 */
public class TiposPrimitivos {
	public static void main(String[] args) {
		// Tipo Boolean
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1, bo2);
		
		/* Char - Destinado ao armazenamento de apenas um caractere. 
		 *		  É representado pela letra envolta em aspas simples. 
		 */
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050';
		System.out.printf("%c %c %c\n", c1, c2, c3);
		
		/* Os números aplicados nas variáveis abaixo são os limites de dados
		 * que podem ser suportados em cada um dos tipos numéricos. Os underlines 
		 * utilizados nos números grandes, servem apenas como espaçadores visuais.
		 * Seu uso é opcional e ele não interfere no valor total do dado.
		 */ 
		// Byte - valor de 1 byte
		byte b = 127;
		
		// Short - valor de 2 bytes
		short s = 32767;
		
		// Int - valor de 4 bytes
		int i = 2_147_483_647;
		
		// Long - valor de 8 bytes
		/* Os números do tipo Long precisam da notação L ao final do numeral porque
		 * apesar de serem números inteiros, eles ultrapassam a quantidade de bytes
		 * necessários para armazenar um número considerado inteiro e literal. Desta
		 * forma, aplicamos o L ao final para informar o sistema que este número, apesar
		 * de grande, é um inteiro literal, assim como os exemplos acima.
		 */
		long l = 9_223_372_036_854_775_807L;
		
		System.out.printf("%d %d %d %d\n", b, s, i, l);
		
		// Float - valor de 4 bytes
		float f = 3.1416f;
		
		// Double - valor de 8 bytes
		double d = 2.45;
		
		System.out.printf("%f %f\n", f, d);
		
		/* Prints de console apenas para exibir a diferença de tamanho de dados entre os tipos
		   numéricos */
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
	}
}
