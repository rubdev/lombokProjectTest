package app;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Hombre", 26, 72, 1.75, "Rubén");
		logInfoPersona(persona);

	}

	private static void logInfoPersona(Persona persona) {
		System.out.println("***********");
		System.out.println("toString: "+ persona.toString());
		System.out.println("***********");
	}
}
