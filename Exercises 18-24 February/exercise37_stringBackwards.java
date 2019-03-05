//Roberto Mares Ceballos 
//37. Write a Java program to reverse a string.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import java.lang.Math; //Importamos el paquete de la clase Math que nos permite utlizar funciones matematicas preprogramadas
import static java.lang.StrictMath.tan;

public class exercise37_stringBackwards{ //declaracion de la clase 
     public static void main (String [ ] args){//declaracion del programa principal 
	
  	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture a phrase: "); //se imprime en pantalla la instruccion
	String normal=in.nextLine();//almacenamos el numero capturado a normal, con el metodo nextLine() 

	String back=new StringBuilder(normal).reverse().toString();
	System.out.println("The phrase backwards is: "+back);//Impresion de la frase al reves
}
}