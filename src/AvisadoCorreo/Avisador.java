package AvisadoCorreo;

// Hilo que avisa si hay correo nuevo
public class Avisador extends Thread {
	Correo cor;

	public Avisador(Correo cor) {
		this.cor = cor;
	}

	public void run() {
		try {
			byte hastaDiez = 0; // 10 veces 0,5 segundos es 5 segundos
			while (true) {
				sleep(500);
				hastaDiez++;
				if (cor.hayCorreo()) {
					if (hastaDiez >= 10) {
						System.err.println("Hay Correo Nuevo");
						hastaDiez = 0;
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Fin Avisador");
		}

	}
}