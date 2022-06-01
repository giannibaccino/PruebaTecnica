package pyr;
import java.util.*;

public class Juego {

	public static void main(String[] args) {
		Premio premioTotal = new Premio(0);
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su nombre de usuario");
		String nombreuser = leer.nextLine();
		Usuario usario = new Usuario(nombreuser,premioTotal);
		
		Categorias categoria = new Categorias(1);
		
		boolean correcto = true;
		Nivel nivel = new Nivel(1, categoria, premioTotal);
		Pregunta preg1 = nivel.selectRandomPreg();
		System.out.println(preg1.getEnunciado());
		
		System.out.println("1: " + preg1.getRespuesta().getRespuestaN(0));
		System.out.println("2: " + preg1.getRespuesta().getRespuestaN(1));
		System.out.println("3: " + preg1.getRespuesta().getRespuestaN(2));
		System.out.println("4: " + preg1.getRespuesta().getRespuestaN(3));
		
	}
}
