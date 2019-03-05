//Roberto Mares Ceballos 
//23. Write a Java program to convert a binary number to hexadecimal number.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise23_BinarytoHex{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero binario: "); //se imprime en pantalla la instruccion
	String binary=in.nextLine(); //se le da el valor a binary el numero capturado pero en formato de cadena  
	
	int decimal=Integer.parseInt(binary,2);//se convierte el numero capturado a binario con el metodo parseInt y especificando la base del sistema que es 2
	String hex=Integer.toHexString(decimal);//por medio del metodo toHexString, convertimos un numero entero, en este caso decimal a una cadena que es el numero en Hexadecimal
	System.out.println("El numero binario en Hexadecimal es: "+hex); // se imprime el numero en Hexadecimal
}
}