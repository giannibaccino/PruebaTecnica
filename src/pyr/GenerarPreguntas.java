package pyr;

import java.util.*;

public class GenerarPreguntas {
	public GenerarPreguntas() {
		super();
	}

	private List<Pregunta> pregs;
	
	
	public String getLetra() {
		return pregs.get(0).getEnunciado();
	}

	public void crearPreguntas() {
		Pregunta pregunta;
		Respuestas respuesta;
		
		List<Pregunta> preguntas = new ArrayList<Pregunta>();
		
		respuesta = new Respuestas(new String[] {"Ecuador","Chile","Venezuela","Boliva"});
		pregunta = new Pregunta("¿Qué país está entre Perú y Colombia?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Rojo, azul, violeta, negro y blanco","Amarillo, azul, negro, rojo y verde","Naranja, verde, azul, rojo y blanco","Negro, blanco, marrón, amarillo y azul"});
		pregunta = new Pregunta("¿Cuáles son los colores de los cinco anillos olímpicos?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Yohan Blake","Asafa Powell","Usain Bolt","Justin Gatlin"});
		pregunta = new Pregunta("¿Qué atleta ostenta el récord de los 100 metros lisos?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Nueve","Cuatro","Once","Seis"});
		pregunta = new Pregunta("¿Cuántos jugadores hay en un equipo de voleibol?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Grecia","Italia","Hawaii","Tailandia"});//5
		pregunta = new Pregunta("¿A qué país pertenece la isla de Creta?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"El Río de la Plata","El Río Amazonas","El Río Misisipi","El Río Orinoco"});
		pregunta = new Pregunta("¿Cuál es el río más caudaloso del mundo?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Steven","Edward","Vincent","Horace"});
		pregunta = new Pregunta("¿Con qué nombre firmaba Van Gogh sus obras?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Hidrógeno","Oxígeno","Metano","Ozono"});
		pregunta = new Pregunta("¿Qué gas de la atmósfera nos protege de la radiación ultravioleta?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Ácido desoxirribonucleico","Ácido dentro nuesto","Ácido desoxidante neutral","Ácido dióniconerval"});
		pregunta = new Pregunta("¿Qué significan las siglas ADN?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"La Cenicienta","Blancanieves","Monster Inc.","Toy Story"});//10
		pregunta = new Pregunta("¿Cuál fue la primera película de Disney?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Mario Benedetti","John Donne","William Shakespeare","Horacio Quiroga"});
		pregunta = new Pregunta("¿Quién escribió “Sueño de una noche de verano”?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"128","110","120","118"});
		pregunta = new Pregunta("¿Cuántos elementos tiene la tabla periódica?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Cassius Clay","Jon Jones","Kamaru Usman","Israel Adesanya"});
		pregunta = new Pregunta("¿Cómo se llamaba Muhammad Ali antes de adoptar este nombre?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Italia","Inglaterra","China","Japón"});
		pregunta = new Pregunta("¿Dónde se inventó el Ping-Pong?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Watson Street","Manila Street","Baker Street","Parker Street"});//15
		pregunta = new Pregunta("¿En qué calle ficticia vivía Sherlock Holmes?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"1989","1976","1990","1969"});
		pregunta = new Pregunta("¿¿En qué año llegó el hombre a la Luna?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Italia","China","Suiza","Alemania"});
		pregunta = new Pregunta("¿En qué país se encuentra el río Po?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"64","50","47","55"});
		pregunta = new Pregunta("¿Por cuántos estados está formado Estados Unidos?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Oxígeno","Hidrógeno","Carbono","Hierro"});
		pregunta = new Pregunta("¿Qué elemento está presente en absolutamente todas las moléculas orgánicas?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Carbono","Nitrógeno","Oxígeno","Hidrógeno"});//20
		pregunta = new Pregunta("¿Cuál es el elemento más abundante de la Tierra?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"La Santa María","La Pinta","La Niña","Todas regresaron"});
		pregunta = new Pregunta("¿Qué carabela no regresó del primer viaje de Colón al Nuevo Mundo?", respuesta, 0);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Paris","Venecia","Alejandria","Roma"});
		pregunta = new Pregunta("¿Cuál era la ciudad hogar de Marco Polo?", respuesta, 1);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"La Última Guerra","La Primer Guerra","La Gran Guerra","La Guerra Final"});
		pregunta = new Pregunta("¿Cómo se conocía la Primera Guerra Mundial antes de que estallara la segunda?", respuesta, 2);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Continua como Stalingrado","Volingrado","Skrolingrado","Volgogrado"});
		pregunta = new Pregunta("¿Cómo se llama a día de hoy la antigua ciudad de Stalingrado?", respuesta, 3);
		preguntas.add(pregunta);
		
		respuesta = new Respuestas(new String[] {"Platón","Aristóteles","Sócrates","Tales de Mileto"});//25
		pregunta = new Pregunta("¿Qué filósofo creó “El mito de la caverna”?", respuesta, 0);
		preguntas.add(pregunta);
		
		pregs = preguntas;
	}
}
