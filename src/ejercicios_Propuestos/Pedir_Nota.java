package ejercicios_Propuestos;

import java.util.*;

public class Pedir_Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numeros = new Scanner(System.in);
		System.out.println("Este ejercicio solicita una nota numerica de 0 a 10 y la escribe en letras" + "\n");
		
		System.out.println("Ingrese la nota");
		int nota = numeros.nextInt();
		
		switch (nota) {
		
		case 1:
						
				System.out.println("La nota ingresada fue: " + nota + " Uno");
			
		break;
		
		case 2:
			
				System.out.println("La nota ingresada fue: " + nota + " Dos");
			
		break;
		
		case 3:
							
				System.out.println("La nota ingresada fue: " + nota + " Tres");
			
		break;
		
		case 4:
			
				System.out.println("La nota ingresada fue: " + nota + " Cuatro");
			
		break;
		
		case 5:
			
				System.out.println("La nota ingresada fue: " + nota + " Cinco");
			
		break;
		
		case 6:
			
				System.out.println("La nota ingresada fue: " + nota + " Seis");
			
		break;
		
		case 7:
			
				System.out.println("La nota ingresada fue: " + nota + " Siete");
			
		break;
		
		case 8:
			
				System.out.println("La nota ingresada fue: " + nota + " Ocho");
			
		break;
		
		case 9:
			
				System.out.println("La nota ingresada fue: " + nota + " Nueve");
			
		break;
		
		case 10:
			
				System.out.println("La nota ingresada fue: " + nota + " 10");
			
		break;
		
		case 0:
			
				System.out.println("La nota ingresada fue: " + nota + " Cero");
			
		break;
			
		default:
			
			System.out.println("La opcion ingresada no es valida");
			
		}
		

	}

}
