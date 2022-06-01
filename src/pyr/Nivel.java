package pyr;

import java.util.*;

public class Nivel {
	private int nivel;
	private Categorias cat;
	private Premio premio;
	
	public Nivel(int nivel, Categorias cat, Premio premio) {
		super();
		this.nivel = nivel;
		this.cat = cat;
		this.premio = premio;
	}

	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public Categorias getCat() {
		return cat;
	}
	
	public void setCat(Categorias cat) {
		this.cat = cat;
	}
	
	public Premio getPremio() {
		return premio;
	}
	
	public void setPremio(Premio premio) {
		this.premio = premio;
	}
	
	public Pregunta selectRandomPreg() {
		int min_val = 0;
        int max_val = 5;
        Random ran = new Random();
        int x = ran.nextInt(max_val) + min_val;
		return cat.getPregs().get(x);
	}
	
	public String mostrarEnunciado(int n) {
		return cat.getPregs().get(n).getEnunciado();
	}
	
	public Respuestas pickRespuestas(int n) {
		return cat.getPregs().get(n).getRespuesta();
	}
	
	public String mostrarRespuestas(int pregunta, int numResp) {
		return cat.getPregs().get(pregunta).getRespuesta().getRespuestaN(numResp);
	}
}
