import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class Exercise7_Mult10{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	Scanner in=new Scanner(System.in);//se crea el objeto de la clase Scanner para poder capturar desde teclado
	System.out.println("Elija un numero para multiplicarlo hasta el 10:"); //se hace una impresion de pantalla con una instruccion
	int numero=in.nextInt(); //se crea la variable que almacena el numero y se le da el valor con el metodo nextInt() de nuestro objeto
	for(int x=1;x<11;x++)
		System.out.println(numero+"x "+x+"= "+numero*x);//se realiza la multiplicacion del numero capturado hasta el 10
    }
}