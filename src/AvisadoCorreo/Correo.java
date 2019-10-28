package AvisadoCorreo;

// Objeto compartido
public class Correo {
	private boolean correoNuevo;

	public Correo() {
		this.correoNuevo = false;
	}

	public boolean hayCorreo() {
		return correoNuevo;
	}

	public void leer() {
		this.correoNuevo = false;
	}

	public void nuevo() {
		this.correoNuevo = true;
	}

}