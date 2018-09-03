package fundamentos;

/* Os wrappers são uma forma de tornar declarar os tipos primitivos
 * como se fossem objetos, trazendo assim propriedades e ações que
 * declarando como um Tipo primitivo, não seria possível ter acesso,
 * uma vez que os tipos primitivos contém apenas o dado.
 * 
 * Para criar um wrapper, em via de regra, basta declarar o tipo
 * com a inicial maiúscula, ou no caso de char e int, se tornam
 * Character e Integer.
 */

public class Wrappers {
	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		/* Como exemplo da diferença entre os tipos e os wrappers, 
		 * podemos tornar o valor booleano em uma string
		 * e solicitar a contagem dos caracteres do valor booleano true. 
		 */
		System.out.println(bo.toString().length());
	}
}
