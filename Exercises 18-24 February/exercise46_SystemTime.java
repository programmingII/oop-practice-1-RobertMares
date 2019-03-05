//Roberto Mares Ceballos 
//46. Write a Java program to display the system time.
import java.util.Scanner; 
import java.io.File;
public class exercise46_SystemTime{ //declaracion de la clase 
	public static void main(String[] args) {//declaracion del programa principal
		 System.out.format("\nHorario del Sistema: %tc%n\n", System.currentTimeMillis());
    }
}
