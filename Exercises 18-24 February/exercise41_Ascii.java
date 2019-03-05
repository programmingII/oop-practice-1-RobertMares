//Roberto Mares Ceballos 
//41. Write a Java program to print the ascii value of a given character.
import java.util.Scanner; 
public class exercise41_Ascii{ //declaracion de la clase 
	  public static void main(String[] args) {//declaracion del programa principal
             	Scanner in=new Scanner(System.in); //se declara nuevo objeto de la clase in
		System.out.println("Capture un caracter: "); //impresion de pantalla 
    		int car = in.next().charAt(0); //se guarda el caracter ingresado desde teclado en la variable car; 
		
		System.out.println("El caracter en ASCII es: "+car);
    }
}