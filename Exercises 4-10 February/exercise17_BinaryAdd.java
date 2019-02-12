import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise17_BinaryAdd{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture un numero binario: "); //se imprime en pantalla la instruccion
	String number1=in.nextLine(); //se le da el valor a number1 el numero capturado en este pero en cadena 

	System.out.println("Capture otro numero binario: "); //se imprime en pantalla la instruccion
	String number2=in.nextLine(); //se le da el valor a number1 el numero capturado en este pero en cadena 
	
	int binary1=Integer.parseInt(number1,2); //se utiliza el metodo parseInt para poder crear el numero binario de binario a decimal
	int binary2=Integer.parseInt(number2,2); //se utliza el metodo parseInt para poder convertir el numero a binario de binario a decimal
	
	int result=binary1+binary2;//suma de los numeros binarios

	String resultado=Integer.toString(result,2);//se convierte el resultado de la suma de decimales se convierte a binario
	System.out.println(resultado); // se imprimen los valores de las variables y la suma de ellas
}
}