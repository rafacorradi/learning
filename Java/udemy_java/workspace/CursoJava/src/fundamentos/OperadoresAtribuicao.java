package fundamentos;

/* S�o operadores que fazem uma opera��o e em seguida j� atribui
 * um valor como resultado, sem a necessidade de exibir a express�o
 * que seria feita para alcan�ar o resultado.
 */

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		b += a; // Soma a � b e atribui o resultado � b.
		b *= 4;
		b -= 2;
		b /= 3;
		
		System.out.println(b);
	}
}
