//Roberto Mares Ceballos 
//34. Write a Java program to compute the area of a hexagon.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import java.lang.Math; //Importamos el paquete de la clase Math que nos permite utlizar funciones matematicas preprogramadas
import static java.lang.StrictMath.tan;

public class exercise34_AreaHex{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	
  	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture the length of side: "); //se imprime en pantalla la instruccion
	int length=in.nextInt();//almacenamos el numero capturado a length, con el metodo nexInt() 
	
	double area=(6 * Math.pow(length,2))/(4*(tan(Math.PI/6))); //se le otorga el valor del numero que se capturo a la variable n1 a traves del metodo nextLine()
	System.out.println("The area of the hexagon is: "+area);
}
}