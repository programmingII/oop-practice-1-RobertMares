//Roberto Mares Ceballos 
//33. Write a Java program and compute the sum of the digits of an integer.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise33_NumberComparison{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	
  	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero: "); //se imprime en pantalla la instruccion
	String number=get.nextLine(); 
	int n1=in.nextInt(); //se le otorga el valor del numero que se capturo a la variable n1 a traves del metodo nextLine()
	int n2=in.nextInt(); //se le otorga el valor del numero que se capturo a la variable n2 a traves del metodo nextLine()	
	
	if(n1>n2)//se compara si el numero n1 es mayor a n2
		System.out.println(n1+">"+n2);//en caso positivo se imprime que el n1 es mayor
	else if(n1==n2)//si no se cumple con la sentencia pasada se compara si son iguales
		System.out.println(n1+"="+n2);//en caso positivo se imprime que son iguales
	else	//si no se cumple con ninguna de las setencias pasada se concluye que el n2 es mayor
		System.out.println(n1+"<"+n2);//se imprime que el n2 es mayor
}
}