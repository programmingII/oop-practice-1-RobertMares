import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise11_Circle{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado
	System.out.println("Capture el radio del Circulo: "); //se imprime en pantalla un mensaje
	float radio=in.nextFloat(); //se le da el valor a radio el numero capturado
	System.out.println("El perimetro del Circulo es: "+(((3.1416*2)*radio))); //se imprime el radio del circulo por medio de la operacion determinada
	System.out.println("El area del Circulo es:"+(3.1416*(radio*radio))); //se imprime el mensaje y la multiplicacion correspondiente al area
 
}
}