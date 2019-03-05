//Roberto Mares Ceballos 
//29. Write a Java program to convert a hexadecimal to a binary number.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise29_HextoBin{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero Hexadecimal: "); //se imprime en pantalla la instruccion
	String hex=in.nextLine(); //se le da el valor a oct el numero capturado pero en formato de cadena  
	
	int decimal=Integer.parseInt(hex,16);//se convierte el numero capturado a decimal con el metodo parseInt y especificando la base del sistema que es 16
	String binary=Integer.toBinaryString(decimal);//toBinaryString es un metodo de la clase Integer que permite convertir un entero decimal a Binario aunque este en String
	System.out.println("El numero Hexadecimal en Binario es: "+binary); // se imprime el numero en binary
}
}