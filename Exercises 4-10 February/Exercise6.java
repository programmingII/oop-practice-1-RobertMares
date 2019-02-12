import java.util.Scanner;
 
public class Exercise6 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);//su usa la clase escanner para poder capturar datos desde teclado
   
  System.out.print("Ingrese un numero: ");//imprimimos la instruccion
  int num1 = in.nextInt();//se crea la variable num1, la cual se le otorga el valor de lo que se capturo
   
  System.out.print("Input otro numero: ");//imprimimos la instruccion
  int num2 = in.nextInt();//se crea la variable num2, la cual se le otorga el valor de lo que se capturo  
   
  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); //suma de las dos variables, y se imprime
   
  System.out.println(num1 + " - " + num2 + " = " + num1 - num2)); //resta de las dos variables, y se imprime
   
  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2)); //multiplicacion de las dos variables, y se imprime
   
  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); //division de las dos variables, y se imprime
 
  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2)); //modulo de las dos variables, y se imprime
 }
}