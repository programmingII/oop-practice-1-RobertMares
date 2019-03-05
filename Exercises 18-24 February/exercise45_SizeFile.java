//Roberto Mares Ceballos 
//45. Write a Java program to find the size of a specified file.
import java.util.Scanner; 
import java.io.File;
public class exercise45_SizeFile{ //declaracion de la clase 
	public static void main(String[] args) {//declaracion del programa principal
		System.out.println("/docs/concha/uno.txt  : " + new File("abc.txt").length() + " bytes");
  		System.out.println("/docs/concha/dos.txt : " + new File("test.txt").length() + " bytes");
 	}
}
