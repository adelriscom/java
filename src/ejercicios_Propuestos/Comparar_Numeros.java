package ejercicios_Propuestos;
import java.util.*;

public class Comparar_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Ingrese el primer numero ");
		int num1 = numero.nextInt();
		System.out.print("El primer numero ingresado es: " + num1 + "\n");
		
		System.out.print("Ingrese el segundo numero ");
		int num2 = numero.nextInt();
		System.out.print("El segundo numero ingresado es: " + num2 + "\n");
		
		if (num1 == num2) {
			
			System.out.println("Los dos numeros son iguales \n");
		}
		else {
			
			System.out.println("Los numeros son diferentes " + " primer numero: " + num1 + ", segundo numero: " + num2);
		}
	}

}
