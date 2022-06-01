package pyr;
import java.util.*;

public class Juego {

	public static void main(String[] args) {
		int lvl = 1;
		Premio premioTotal = new Premio(0);
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Bienvenido al TriviaQuest! \nIngresa un nombre de usuario para comenzar a jugar");
		String nombreuser = leer.nextLine();
		Usuario usuario = new Usuario(nombreuser,premioTotal);
		
		boolean correcto = true;
		
		while (correcto && lvl<=5) {
			Categorias categoria = new Categorias(lvl);
			Nivel nivel = new Nivel(lvl, categoria, premioTotal);
			
			Pregunta preg = nivel.selectRandomPreg();
			System.out.println(preg.getEnunciado());
			
			System.out.println("1: " + preg.getRespuesta().getRespuestaN(0));
			System.out.println("2: " + preg.getRespuesta().getRespuestaN(1));
			System.out.println("3: " + preg.getRespuesta().getRespuestaN(2));
			System.out.println("4: " + preg.getRespuesta().getRespuestaN(3));
			System.out.println();
			System.out.println("Puntaje: " + premioTotal.getMonto());
			System.out.println("Si quieres salir del juego ingresa la letra S");
			
			 leer = new Scanner(System.in);
			char respuestauser = leer.next().charAt(0);
			
			if (respuestauser == preg.getCorrecta()) {
				System.out.println("Respuesta correcta \nGanaste " + premioTotal.premioDeNivel(lvl) + " puntos");
				System.out.println();
				premioTotal.sumarMonto(premioTotal.premioDeNivel(lvl));
				usuario.setPuntaje(premioTotal);
				nivel.siguientNivel();
				categoria.siguienteCategoria();
				lvl++;
			}
			else if (respuestauser == 's' || respuestauser == 'S' ) {
				System.out.println("Saliste del juego \nAcumulaste: " + premioTotal.getMonto() + " puntos");
				correcto = false;
			}
			else {
				System.out.println("Respusta incorrecta \nFin del juego \nTu puntaje fue de: " + premioTotal.getMonto() + " puntos" );
				correcto = false;
			}
		}
		if (correcto) {
			System.out.println("FELICITACIONES " + usuario.getNombre() +" GANASTE! \nAcumulaste: " + premioTotal.getMonto() + " puntos");
		}
		leer.close();
	}
}
