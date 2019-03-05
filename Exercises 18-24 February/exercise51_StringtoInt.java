//Roberto Mares Ceballos 
//51. Write a Java program to convert a string to an integer in Java.
import java.util.Scanner; 
public class exercise51_StringtoInt{ //declaracion de la clase 
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Captura un caracter: ");
		String cad=in.nextLine(); 
		
		int number=Integer.parseInt(cad);
		System.out.println("Valor de entero: "+number);
	}
}
