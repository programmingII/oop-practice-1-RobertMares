//Roberto Mares Ceballos 
//31. Write a Java program to check whether Java is installed on your computer.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise31_Javaversion{ //declaracion de la clase 
    public static void main (String [ ] args){//declaracion del programa principal 
	
    	System.out.println(System.getProperty("java.version"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos a la version de Java
    	System.out.println(System.getProperty("java.runtime.version"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos a la version de Java
    	System.out.println(System.getProperty("java.home"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos a la version home de Java
    	System.out.println(System.getProperty("java.vendor"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos al vendor de Java
    	System.out.println(System.getProperty("java.vendor.url"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos a la url del vendor de Java
    	System.out.println(System.getProperty("java.class.path"));//se llama al metodo getProperty el cual nos deja ver la informacion legal del JDK, en este caso buscamos a la liga de donde esta instalado Java
	}
}