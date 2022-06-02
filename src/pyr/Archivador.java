package pyr;

import java.io.*;

public class Archivador {
	public void leer() {  //Lee las lineas del archivo registros.txt
		try {
			FileReader entrada = new FileReader("./registros.txt");
			
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while(linea != null) {
				linea = mibuffer.readLine();
				if(linea != null)
					System.out.println(linea);
			}
			entrada.close();
			
		} 
		catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	
	public void escribir(String username, int record, String fecha) { // Escribe en registros.txt los datos del jugador al terminar el juego
		String log = "-" + username + "->Puntaje:" + record + "->Fecha de juego: " + fecha + "\n";
		
		try {
			FileWriter escritura = new FileWriter("./registros.txt", true);
			
			for (int i = 0; i < log.length(); i++) {
				escritura.write(log.charAt(i));
			}
			
			escritura.close()
;			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
