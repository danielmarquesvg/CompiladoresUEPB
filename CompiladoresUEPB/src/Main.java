public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o c�digo de uma classe de entrada");
		System.out.print("Lembrando que o c�digo deve seguir as regras gramaticais expl�citas no projeto: ");
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