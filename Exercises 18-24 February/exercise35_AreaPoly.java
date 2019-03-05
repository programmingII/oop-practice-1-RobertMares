//Roberto Mares Ceballos 
//35. Write a Java program to compute the area of a polygon.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java
import java.lang.Math; //Importamos el paquete de la clase Math que nos permite utlizar funciones matematicas preprogramadas
import static java.lang.StrictMath.tan;

public class exercise35_AreaPoly{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	
  	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture the sides of the polygon: "); //se imprime en pantalla la instruccion
	double sides=in.nextDouble();//almacenamos el numero capturado a sides, con el metodo nexDouble() 

	System.out.println("Capture the length of side: "); //se imprime en pantalla la instruccion
	double length=in.nextDouble();//almacenamos el numero capturado a length, con el metodo nexDouble() 
	
	double area=(sides*Math.pow(length,2)/(4*(tan(Math.PI/sides))));
	System.out.println("The area of the hexagon is: "+area);//Impresion del resultado del calculo del area contenido en la variable Area
}
}