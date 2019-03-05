//Roberto Mares Ceballos 
//30. Write a Java program to convert a hexadecimal to a octal number.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise30_HextoOct{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero Hexadecimal: "); //se imprime en pantalla la instruccion
	String hex=in.nextLine(); //se le da el valor a oct el numero capturado pero en formato de cadena  
	
	int decimal=Integer.parseInt(hex,16);//se convierte el numero capturado a decimal con el metodo parseInt y especificando la base del sistema que es 16
	String oct=Integer.toOctalString(decimal);//toBinaryString es un metodo de la clase Integer que permite convertir un entero decimal a Octal aunque este en String
	System.out.println("El numero Hexadecimal en Octal es: "+oct); // se imprime el numero en Octal
}
}