package fundamentos;

/* São operadores que fazem uma operação e em seguida já atribui
 * um valor como resultado, sem a necessidade de exibir a expressão
 * que seria feita para alcançar o resultado.
 */

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		b += a; // Soma a à b e atribui o resultado à b.
		b *= 4;
		b -= 2;
		b /= 3;
		
		System.out.println(b);
	}
}
