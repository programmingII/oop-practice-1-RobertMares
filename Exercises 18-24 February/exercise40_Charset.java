//Roberto Mares Ceballos 
//40. Write a Java program to list the available character sets in charset objects.

import java.nio.charset.Charset;

public class exercise40_Charset{ //declaracion de la clase 
	 public static void main(String[] args) {//declaracion del programa principal
		System.out.println("Caracteres de CharSet: "); //impresion de pantalla 
    		for (String str : Charset.availableCharsets().keySet()) { //se crea un string str que almacenara todos los charsets disponibles
      			System.out.println(str);//impresion de str
    		}
  	}
}