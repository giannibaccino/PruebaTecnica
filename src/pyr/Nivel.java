package pyr;

import java.util.*;

public class Nivel {//Los niveles seleccionan la categoria y las preguntas de las mismas
	private int nivel;
	private Categorias cat;
	
	public Nivel(int nivel, Categorias cat) {
		super();
		this.nivel = nivel;
		this.cat = cat;
	}

	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void siguientNivel() {
		this.nivel++;
	}
	
	public Categorias getCat() {
		return cat;
	}
	
	public void setCat(Categorias cat) {
		this.cat = cat;
	}
		
	public Pregunta selectRandomPreg() { //Se elige una pregunta al azar de la categoria correspondiente al nivel
		int min_val = 0;
        int max_val = 5;
        Random ran = new Random();
        int x = ran.nextInt(max_val) + min_val;
		return cat.getPregs().get(x);
	}
	
	public String mostrarEnunciado(int n) { //Se muestra el enunciado de la pregunta n de la categoria correspondiente
		return cat.getPregs().get(n).getEnunciado();
	}
	
	public Respuestas pickRespuestas(int n) { //Devuelve las repsuerstas de la pregunta n de la categoria correspondiente
		return cat.getPregs().get(n).getRespuesta();
	}
	
	public String mostrarRespuestas(int pregunta, int numResp) { //Se muestra el enunciado de la respuesta 'numResp' a la pregunta 'pregunta' de la categoria correspondient
		return cat.getPregs().get(pregunta).getRespuesta().getRespuestaN(numResp);
	}
}
