package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		/*
		 * Declaração de variáveis 
		 * 
		 * Variável -> tem nome sempre em minúsculas
		 * Constante -> tem nome todo maíusculo. Em caso de duas palavras, 
		 * 				separar com underline
		 * 
		 * Tanto variável, quanto constantes recebem os tipos de valores que irão conter.
		 * Ex: string, double, number, etc. Os tipos serão mostrados em outra aula
		 * 
		 **/
		
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("A área é " + area + " m².");
		System.out.printf("A área é %f m². \n", area);
		System.out.printf("A área é %.2f m².", area);
		
		/*
		 * Diferença entre os prints mostrados acima
		 *  
		 * println -> Faz uma quebra de linha automática ao final da impressão.
		 * printf -> Aplica o valor da variável inserida como segundo argumento
		 * 			 no placeholder %f.
		 * 
		 * No segundo exemplo, está aplicado o código "\n" que faz uma quebra de 
		 * linha quando é executado pelo console.
		 * 
		 * No terceiro exemplo, está aplicado o placeholder "%.2f" que além de 
		 * substituir o pelo valor da macro, aplica um arredondamento do resultado.
		 * 
		 * 
		 **/
	}
}
