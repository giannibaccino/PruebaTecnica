package pyr;

public class Usuario {
	private Premio puntaje;
	private String nombre;
	
	public Usuario(String nombre, Premio puntaje) {
		super();
		this.puntaje = puntaje;
		this.nombre = nombre;
	}
	
	public Premio getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Premio puntaje) {
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
