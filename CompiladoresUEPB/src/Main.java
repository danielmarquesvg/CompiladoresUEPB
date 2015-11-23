public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o código de uma classe de entrada");
		System.out.print("Lembrando que o código deve seguir as regras gramaticais explícitas no projeto: ");
		System.out.println();
		Analisador analisador = new Analisador(System.in);
		
		try {
			analisador.Start();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}