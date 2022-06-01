package pyr;

public class Respuestas {
	private String[] posibles;

	public Respuestas(String[] posibles) {
		super();
		this.posibles = posibles;
	}

	public String[] getPosibles() {
		return posibles;
	}
	
	public void setPosibles(String[] posibles) {
		this.posibles = posibles;
	}
	
	public String getRespuestaN(int n) {
		return posibles[n];
	}
}
