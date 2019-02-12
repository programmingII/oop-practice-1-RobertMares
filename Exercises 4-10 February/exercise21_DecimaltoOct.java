import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise21_DecimaltoOct{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero decimal: "); //se imprime en pantalla la instruccion
	int decimal=in.nextInt(); //se le da el valor a decimal el numero capturado  
	
	String oct=Integer.toOctalString(decimal);//se convierte el numero capturado a Octal con el metodo toOctal
	System.out.println("El numero en Hexadecimal es: "+oct); // se imprime el numero en octal
}
}