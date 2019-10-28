package CorrectorConsola;

// Hilo corrector
public class Corrector extends Thread {
	// Instacia de nuestro objeto compartido
	Palabra pal;

	public Corrector(Palabra pal) {
		// Inicializamos el objeto compartido
		this.pal = pal;
	}

	public void run() {
		String correcto = "";
		String texto = "";
		try {
			do {
				sleep(500);
				if (!pal.isCorrect()) {
					pal.setIsCorrect();
					texto = pal.getWord();
					correcto = pal.check();
					if (!texto.equals(correcto) && !texto.equalsIgnoreCase("fin")) {
						System.err.println("Error: " + correcto);
					}else if(texto.equals(correcto) && !texto.equalsIgnoreCase("fin")) {
						System.out.println("Correcto");
					}
				}

			} while (!texto.equalsIgnoreCase("fin"));
		} catch (InterruptedException e) {
			System.out.println("Corrector abortado");
		}
		System.out.println("Fin Corrector");
	}
}
