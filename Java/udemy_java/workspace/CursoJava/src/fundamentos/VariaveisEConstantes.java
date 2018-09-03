package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		/*
		 * Declara��o de vari�veis 
		 * 
		 * Vari�vel -> tem nome sempre em min�sculas
		 * Constante -> tem nome todo ma�usculo. Em caso de duas palavras, 
		 * 				separar com underline
		 * 
		 * Tanto vari�vel, quanto constantes recebem os tipos de valores que ir�o conter.
		 * Ex: string, double, number, etc. Os tipos ser�o mostrados em outra aula
		 * 
		 **/
		
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("A �rea � " + area + " m�.");
		System.out.printf("A �rea � %f m�. \n", area);
		System.out.printf("A �rea � %.2f m�.", area);
		
		/*
		 * Diferen�a entre os prints mostrados acima
		 *  
		 * println -> Faz uma quebra de linha autom�tica ao final da impress�o.
		 * printf -> Aplica o valor da vari�vel inserida como segundo argumento
		 * 			 no placeholder %f.
		 * 
		 * No segundo exemplo, est� aplicado o c�digo "\n" que faz uma quebra de 
		 * linha quando � executado pelo console.
		 * 
		 * No terceiro exemplo, est� aplicado o placeholder "%.2f" que al�m de 
		 * substituir o pelo valor da macro, aplica um arredondamento do resultado.
		 * 
		 * 
		 **/
	}
}
