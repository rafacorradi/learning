package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String text = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		
		System.out.println(text);
	}
}