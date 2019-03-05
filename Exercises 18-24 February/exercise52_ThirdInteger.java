//Roberto Mares Ceballos 
//52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
import java.util.Scanner; 
public class exercise52_ThirdInteger{ //declaracion de la clase 
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Captura 3 numeros: ");
		int n1=in.nextInt(); 
		int n2=in.nextInt(); 
		int n3=in.nextInt(); 
		
		if((n1 + n2) == n3 || (n2 + n3) == n1 || (n3 + n1) == n2)
                    System.out.println("La suma de los numeros es: "+true);
                else 
                   System.out.println("La suma de los numeros es: "+false);
	}
}
