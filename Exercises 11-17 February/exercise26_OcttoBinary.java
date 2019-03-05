//Roberto Mares Ceballos 
//26. Write a Java program to convert a octal number to a binary number.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise26_OcttoBinary{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero Octal: "); //se imprime en pantalla la instruccion
	String oct=in.nextLine(); //se le da el valor a oct el numero capturado pero en formato de cadena  
	
	int decimal=Integer.parseInt(oct,8);//se convierte el numero capturado a decimal con el metodo parseInt y especificando la base del sistema que es 8
	String binary=Integer.toBinaryString(decimal);//el metodo toOctalString nos permite convertir el decimal a binario
	System.out.println("El numero Octal en Binario es: "+binary); // se imprime el numero en Binario
}
}