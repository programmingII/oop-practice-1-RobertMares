/*Roberto Mares Ceballos 2/5/2019 1.25*/
import java.util.Scanner;
 
public class Exercise5_TwoInput {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Capture un numero: ");
  int num1 = in.nextInt();
   
  System.out.print("Capture otro numero: ");
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
 }
 
}