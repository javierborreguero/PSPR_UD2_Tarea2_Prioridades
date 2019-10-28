package CorrectorConsola;

// Objeto compartido
public class Palabra {
	// Palabra a corregir
	private String word;
	// Verificaci�n de que es correcta
	private boolean isCorrect;

	public Palabra() {
		// Constructor en el que inicializamos las variables
		this.word = "";
		this.isCorrect = true;
	}

	public void leer(String palabra) {
		// Leemos la palabra para comoprobar que est� bien escrita
		this.word = palabra;
		this.isCorrect = false;
	}

	public String check() {
		// Metemos nuestra palabra en una cadena desde el primer caracter
		char inicial = word.charAt(0);
		// Cogemos la primera letra de nuestra cadena
		String resto = word.substring(1, word.length());
		// Comparamos si est�n escritas con may�culas
		inicial = Character.toUpperCase(inicial);
		resto = resto.toLowerCase();
		this.isCorrect = true;
		return inicial + resto;
	}

	// Comprobamos si est� bien escrita
	public boolean isCorrect() {
		return isCorrect;
	}
	// Cogemos la palabra

	public String getWord() {
		return word;
	}

	// Cogemos el resultado
	public void setIsCorrect() {
		this.isCorrect = true;
	}
}