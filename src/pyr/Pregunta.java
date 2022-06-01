package pyr;

public class Pregunta {
	private String enunciado;
	private Respuestas respuesta;
	private int correcta;

	public Pregunta(String enunciado, Respuestas respuesta, int correcta) {
		super();
		this.enunciado = enunciado;
		this.respuesta = respuesta;
		this.correcta = correcta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Respuestas getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(Respuestas respuesta) {
		this.respuesta = respuesta;
	}

	public int getCorrecta() {
		return correcta;
	}

	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}
}
