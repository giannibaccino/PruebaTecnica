package pyr;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Juego {

	public static void main(String[] args) { //Se ejecuta el juego
		int lvl = 1;
		Premio premioTotal = new Premio(0);
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Bienvenido al TriviaQuest! \nIngresa un nombre de usuario para comenzar a jugar");
		String nombreuser = leer.nextLine();
		Usuario usuario = new Usuario(nombreuser,premioTotal); //Se inicializa el usuario
		
		while (nombreuser.isBlank()) {
			System.out.println("Porfavor ingresa un nombre de usuario");
			nombreuser = leer.nextLine();
		}
		boolean correcto = true;
		
		while (correcto && lvl<=5) { //Se generan las preguntas
			Categorias categoria = new Categorias(lvl);
			Nivel nivel = new Nivel(lvl, categoria);
			Pregunta preg = nivel.selectRandomPreg();
			System.out.println(preg.getEnunciado() + "\n");			
			System.out.println("1: " + preg.getRespuesta().getRespuestaN(0));
			System.out.println("2: " + preg.getRespuesta().getRespuestaN(1));
			System.out.println("3: " + preg.getRespuesta().getRespuestaN(2));
			System.out.println("4: " + preg.getRespuesta().getRespuestaN(3));
			System.out.println();
			System.out.println("Tu puntaje: " + premioTotal.getMonto());
			System.out.println("Ingresa 'salir' si deseas terminar el juego\n");
			
			String respuestauser = leer.nextLine();
			
			if (respuestauser.isBlank()) {
				System.out.println("No ingresaste ninguna respuesta\nFin del juego\nTu puntaje es: 0");
				premioTotal.reiniciarMonto();
				correcto = false;
			}
			else if (respuestauser.charAt(0) == preg.getCorrecta()) {
				System.out.println("Respuesta correcta! \n\nGanaste " + premioTotal.premioDeNivel(lvl) + " puntos");
				System.out.println();
				premioTotal.sumarMonto(premioTotal.premioDeNivel(lvl));
				usuario.setPuntaje(premioTotal);
				nivel.siguientNivel();
				categoria.siguienteCategoria();
				lvl++;
			}
					
			else if (respuestauser.equalsIgnoreCase("salir")) {
				System.out.println("Saliste del juego " + usuario.getNombre() + "\n" + "Acumulaste: " + premioTotal.getMonto() + " puntos");
				correcto = false;
			}
					
			else {
				System.out.println("Respuesta incorrecta \nFin del juego\nTu puntaje es: 0");
				premioTotal.reiniciarMonto();
				correcto = false;
			}
				
			
			if (lvl == 6) {
				System.out.println("FELICITACIONES " + usuario.getNombre() +" GANASTE! \nAcumulaste: " + premioTotal.getMonto() + " puntos");
			}
		}
		leer.close();
		
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
        Archivador registro = new Archivador();
        registro.escribir(usuario.getNombre(), premioTotal.getMonto(), fecha.format(LocalDateTime.now())); //Se registra el juego
	}
}
