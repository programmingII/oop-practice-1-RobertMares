/*Roberto Mares Ceballos 
55. Write a Java program to convert seconds to hour, minute and seconds. */

import java.util.Scanner; 

public class exercise55_SecondstoHours{ //declaracion de la clase 
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        	System.out.print("Input seconds: ");
		int seconds = in.nextInt(); 
       		int p1 = seconds % 60;
        	int p2 = seconds / 60;
        	int p3 = p2 % 60;
       		p2 = p2 / 60;
        	System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
	}
}
