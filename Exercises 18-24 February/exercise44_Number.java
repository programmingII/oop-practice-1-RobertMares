//Roberto Mares Ceballos 
//44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
import java.util.Scanner; 
public class exercise44_Number{ //declaracion de la clase 
	public static void main(String[] args) {//declaracion del programa principal
		Scanner in=new Scanner(System.in);
		System.out.println("Captura un numero: ");
		int n=in.nextInt(); 

		System.out.println(n+" + "+n+n+" + "+n+n+n);  
        }
}