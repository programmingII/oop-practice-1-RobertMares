import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise13_Rectangle{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 

	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture la altura del rectangulo "); //se imprime en pantalla la instruccion
	float altura=in.nextFloat(); //se le da el valor a altura el numero capturado

	System.out.println("Capture el ancho del rectangulo "); //se imprime en pantalla la instruccion
	float ancho=in.nextFloat(); //se le da el valor a ancho el numero capturado
	
	System.out.println("El perimetro del circulo es: "+(altura*ancho)+"\n El area del Circulo es: "+ (2*(altura+ancho))); //se imprime y calcula el perimetro y area del rectangulo
}
}