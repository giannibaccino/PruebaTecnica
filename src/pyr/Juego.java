package pyr;
import java.util.*;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min_val = 1;
        int max_val = 4;
        Random ran = new Random();
        int x = ran.nextInt(max_val) + min_val;
        System.out.println("Random Number: "+x);
	}

}
