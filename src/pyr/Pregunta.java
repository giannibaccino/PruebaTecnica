package pyr;

public class Pregunta { //Las preguntas contienen el enunciado su arreglo de respuestas y un char (numero) que corresponde la ubicacion en el arreglo de la respuesta correcta (respuestas[correcta])
	private String enunciado;
	private Respuestas respuesta;
	private char correcta;

	public Pregunta(String enunciado, Respuestas respuesta, char correcta) {
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

	public char getCorrecta() {
		return correcta;
	}

	public void setCorrecta(char correcta) {
		this.correcta = correcta;
	}
}
