//Roberto Mares Ceballos 
//39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.


public class exercise39_Combinations{ //declaracion de la clase 
	 public static void main(String[] args) {//declaracion del programa principal
		int cont = 0;//se declara la variable enter cont que alamecenara el numero de combinaciones posibles
		for(int i = 1; i <= 4; i++){//se crea el primer ciclo anidado
			for(int j = 1; j <= 4; j++){//segundo ciclo anidado
				for(int k = 1; k <= 4; k++){//tercer ciclo anidado
					if(k != i && k != j && i != j){//se verifica que no se repitan los numeros
						cont++;//por cada numero creado se aumenta uno a la variable cont
						System.out.println(i + "" + j + "" + k);//impresion de la combinacion
					}
				}
			}
		}
		System.out.println("El numero total de combinaciones es: " + cont);//impresion del total de numeros que se lograron combinar
	}
}