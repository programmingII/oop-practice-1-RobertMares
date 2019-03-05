//Roberto Mares Ceballos 
//49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
import java.util.Scanner; 
public class exercise49_OddandEvenNumbers{ //declaracion de la clase 
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in); 
		System.out.println("Capture un numero: ");
		int n=in.nextInt(); 
		 
		if(n%2==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
