/*Roberto Mares Ceballos 
53. Write a Java program that accepts three integers from the user and return true if 
the second number is greater than first number and third number is greater than second 
number. If "abc" is true second number does not need to be greater than first number.*/

import java.util.Scanner; 

public class exercise53_ABC{ //declaracion de la clase 
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Captura 3 numeros: ");
		int n1=in.nextInt(); 
		int n2=in.nextInt(); 
		int n3=in.nextInt(); 
		
		if(n2>n1 && n3>n2)
                    System.out.println("Resultado "+true);
                else 
                   System.out.println("Resultado: "+false);
	}
}
