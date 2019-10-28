package AvisadoCorreo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Correo correo = new Correo();
		// Le paso al hilo avisador la variable (objeto) de sincronización
		Avisador avisador = new Avisador(correo);
		String lectura = null;
		avisador.setPriority(Thread.MIN_PRIORITY);
		avisador.start();
		do {
			System.out.print("Mensajes de usuario (leer/nuevo/fin): ");
			lectura = sc.nextLine();
			if (lectura.equals("leer"))
				correo.leer();
			else if (lectura.equals("nuevo"))
				correo.nuevo();
		} while (!lectura.equalsIgnoreCase("fin"));
		// Termino de forma irregular el hilo hijo, mandándole una señal
		avisador.interrupt();
		System.out.println("Fin Programa Principal");
	}

}
