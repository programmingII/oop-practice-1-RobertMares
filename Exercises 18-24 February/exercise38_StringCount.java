//Roberto Mares Ceballos 
//38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.

import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class exercise38_StringCount{ //declaracion de la clase 
     public static void main (String [ ] args){//declaracion del programa principal 
	
  	Scanner in=new Scanner(System.in); //se crea el objeto de la clase Scanner para poder capturar desde teclado

	System.out.println("Capture a phrase: "); //se imprime en pantalla la instruccion
	String phrase=in.nextLine();//almacenamos la frase capturada por medio del metodo nextLine()

	char[] arr=phrase.toCharArray(); 
        int length=arr.length;
        
        int number=0;
        int letter=0;
        int space=0; 
        int others=0;
        
        for(int i=0; i<length; i++){
         if(arr[i]>47 && arr[i]<58)
             number++;
         else if((arr[i]>64 && arr[i]<91)||(arr[i]>96&&arr[i]<126))
             letter++;
         else if(arr[i]==32)
             space++; 
         else
             others++;
     }
	System.out.println("letters: "+letter+"\n number: "+number+"\n space: "+space+" others: "+others);//Impresion de la frase al reves
}
}