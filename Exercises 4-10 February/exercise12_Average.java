import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise12_Average{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado
	System.out.println("Capture 3 numeros: "); //se imprime en pantalla la instruccion
	int numero1=in.nextInt(); //se le da el valor a numero1 el numero capturado
	int numero2=in.nextInt(); //se le da el valor a numero2 el numero capturado
	int numero3=in.nextInt(); //se le da el valor a numero3 el numero capturado
	System.out.println("El promedio de los 5 numero es: "+(numero1+numero2+numero3)/3);//se imprime y calcula el promedio de los 3 numeros capturados
}
}