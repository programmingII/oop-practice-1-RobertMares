//Roberto Mares Ceballos 
//50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
import java.util.Scanner; 
public class exercise50_Numbers35{ //declaracion de la clase 
	public static void main(String args[]) {
		System.out.println("Divisibles 3: ");
		for(int i=1;i<101;i++){
			if(i%3==0)
				System.out.println(i);
		}
		System.out.println("Divisibles 5: ");
		for(int i=1;i<101;i++){
			if(i%5==0)
				System.out.println(i);
		}
		System.out.println("Divisibles 3 y 5: ");
		for(int i=1;i<101;i++){
			if((i%3==0)&&(i%5==0))
				System.out.println(i);
		}
	}
}
