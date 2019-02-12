import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise15_Swap{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture una variable: "); //se imprime en pantalla la instruccion
	float v1=in.nextFloat(); //se le da el valor a v1 el numero capturado

	System.out.println("Capture otra variable: "); //se imprime en pantalla la instruccion
	float v2=in.nextFloat(); //se le da el valor a v2 el numero capturado

	float aux=v1; //se crea una variable auxiliar que toma el valor de v1
	v1=v2; //v1 toma el valor de v2
	v2=aux; //v2 toma el valor aux, que en realidad es el de v1

	System.out.println("El cambio de valores de la variables es \n v1: "+v1+"\n v2: "+v2); // se imprimen los valores invertidos de las variables
}
}