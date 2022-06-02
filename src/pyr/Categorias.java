package pyr;

import java.util.*;

public class Categorias { //Las categorias consisten en una lista de preguntas segun el nivel en el que se esta
	private int nivel;
	private List<Pregunta> pregs;
	
	public Categorias(int nivel) {
		super();
		this.nivel = nivel;
		this.pregs = crearCategoria(nivel);
	}
	
	public List<Pregunta> getPregs() {
		return pregs;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public void siguienteCategoria() {
		this.nivel++;
	}
	
	public List<Pregunta> crearCategoria(int nivel) {//Se crean las categorias segun el nivel requerido
		Pregunta pregunta;
		Respuestas respuesta;
		
		List<Pregunta> preguntas = new ArrayList<Pregunta>();
		
		switch (nivel) {
			case 1:
				respuesta = new Respuestas(new String[] {"Ecuador","Chile","Venezuela","Bolivia"});
				pregunta = new Pregunta("Que pais esta entre Peru y Colombia?", respuesta, '1');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Rojo, azul, violeta, negro y blanco","Amarillo, azul, negro, rojo y verde","Naranja, verde, azul, rojo y blanco","Negro, blanco, marrón, amarillo y azul"});
				pregunta = new Pregunta("Cuales son los colores de los cinco anillos olimpicos?", respuesta, '2');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Yohan Blake","Asafa Powell","Usain Bolt","Justin Gatlin"});
				pregunta = new Pregunta("Que atleta ostenta el record de los 100 metros lisos?", respuesta, '3');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Nueve","Cuatro","Once","Seis"});
				pregunta = new Pregunta("Cuantos jugadores hay en un equipo de voleibol?", respuesta, '4');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Grecia","Italia","Hawaii","Tailandia"});//5
				pregunta = new Pregunta("A que pais pertenece la isla de Creta?", respuesta, '1');
				preguntas.add(pregunta);
				break;
				
			case 2:
				respuesta = new Respuestas(new String[] {"El Rio de la Plata","El Rio Amazonas","El Rio Misisipi","El Rio Orinoco"});
				pregunta = new Pregunta("Cual es el rio mas caudaloso del mundo?", respuesta, '2');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Steven","Edward","Vincent","Horace"});
				pregunta = new Pregunta("Con que nombre firmaba Van Gogh sus obras?", respuesta, '3');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Hidrogeno","Oxigeno","Metano","Ozono"});
				pregunta = new Pregunta("Que gas de la atmosfera nos protege de la radiacion ultravioleta?", respuesta, '4');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Acido desoxirribonucleico","Acido dentro nuesto","Acido desoxidante neutral","Acido dióniconerval"});
				pregunta = new Pregunta("Que significan las siglas ADN?", respuesta, '1');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"La Cenicienta","Blancanieves","Monster Inc.","Toy Story"});//10
				pregunta = new Pregunta("Cual fue la primera pelicula de Disney?", respuesta, '2');
				preguntas.add(pregunta);
				break;
		
			case 3:
				respuesta = new Respuestas(new String[] {"Mario Benedetti","John Donne","William Shakespeare","Horacio Quiroga"});
				pregunta = new Pregunta("Quien escribio “Sueno de una noche de verano”?", respuesta, '3');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"128","110","120","118"});
				pregunta = new Pregunta("Cuantos elementos tiene la tabla periodica?", respuesta, '4');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Cassius Clay","Jon Jones","Kamaru Usman","Israel Adesanya"});
				pregunta = new Pregunta("Como se llamaba Muhammad Ali antes de adoptar este nombre?", respuesta, '1');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Italia","Inglaterra","China","Japon"});
				pregunta = new Pregunta("Donde se invento el Ping-Pong?", respuesta, '2');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Watson Street","Manila Street","Baker Street","Parker Street"});//15
				pregunta = new Pregunta("En que calle ficticia vivia Sherlock Holmes?", respuesta, '3');
				preguntas.add(pregunta);
				break;
			
			case 4:	
				respuesta = new Respuestas(new String[] {"1989","1976","1990","1969"});
				pregunta = new Pregunta("En que ano llego el hombre a la Luna?", respuesta, '4');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Italia","China","Suiza","Alemania"});
				pregunta = new Pregunta("En que pais se encuentra el rio Po?", respuesta, '1');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"64","50","47","55"});
				pregunta = new Pregunta("Por cuantos estados esta formado Estados Unidos?", respuesta, '2');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Oxigeno","Hidrogeno","Carbono","Hierro"});
				pregunta = new Pregunta("Que elemento esta presente en absolutamente todas las moleculas organicas?", respuesta, '3');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Carbono","Nitrogeno","Oxigeno","Hidrogeno"});//20
				pregunta = new Pregunta("Cual es el elemento mas abundante de la Tierra?", respuesta, '4');
				preguntas.add(pregunta);
				break;
						
			case 5:
				respuesta = new Respuestas(new String[] {"La Santa Maria","La Pinta","La Nina","Todas regresaron"});
				pregunta = new Pregunta("Que carabela no regreso del primer viaje de Colon al Nuevo Mundo?", respuesta, '1');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Paris","Venecia","Alejandria","Roma"});
				pregunta = new Pregunta("Cual era la ciudad hogar de Marco Polo?", respuesta, '2');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"La Ultima Guerra","La Primer Guerra","La Gran Guerra","La Guerra Final"});
				pregunta = new Pregunta("Como se conocia la Primera Guerra Mundial antes de que estallara la segunda?", respuesta, '3');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Continua como Stalingrado","Volingrado","Skrolingrado","Volgogrado"});
				pregunta = new Pregunta("Como se llama a dia de hoy la antigua ciudad de Stalingrado?", respuesta, '4');
				preguntas.add(pregunta);
				
				respuesta = new Respuestas(new String[] {"Platon","Aristoteles","Socrates","Tales de Mileto"});//25
				pregunta = new Pregunta("Que filosofo creo “El mito de la caverna”?", respuesta, '1');
				preguntas.add(pregunta);
				break;
		}
		return preguntas;
	}
}
