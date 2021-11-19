package ejercicios_Propuestos;

import java.util.*;

public class PruebaConceptual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, decenas, unidades;
		
		Scanner resultado = new Scanner(System.in);
		
		System.out.println("ingrese un numero entre 0 y 99");
		numero = resultado.nextInt();
		
		decenas = numero/10;
		unidades = numero%10;
		
		//System.out.println("La decena es: " + decenas);
		
		//System.out.println("Las unidades son: " + unidades);
		
		if(decenas == 0) {
			switch(unidades) {
			
			case 0:
				System.out.println("");
						
			break;
			
			case 1:
			
			System.out.println("El numero es: " + "Uno");
			
			break;
			
			case 2:
				
				System.out.println("El numero es: " + "Dos");
				
			break;
			
			case 3:
				
				System.out.println("El numero es: " + "Tres");
				
			break;
			
			case 4:
				
				System.out.println("El numero es: " + "Cuatro");
				
			break;
				
			case 5:
				
				System.out.println("El numero es: " + "Cinco");
				
			break;
				
			case 6:
				
				System.out.println("El numero es: " + "Seis");
				
			break;
				
			case 7:
				
				System.out.println("El numero es: " + "Siete");
				
			break;
				
			case 8:
				
				System.out.println("El numero es: " + "Ocho");
				
			break;
				
			case 9:
				
				System.out.println("El numero es: " + "Nueve");
				
			break;
			
			default:
				System.out.println("La opcion no es valida");
		}
		

	}
		
		else if(decenas == 1) {
			switch(unidades) {
			
			case 0:
				System.out.println("El numero es: " + "Diez");
						
			break;
			
			case 1:
			
			System.out.println("El numero es: " + "Once");
			
			break;
			
			case 2:
				
				System.out.println("El numero es: " + "Doce");
				
			break;
			
			case 3:
				
				System.out.println("El numero es: " + "Trece");
				
			break;
			
			case 4:
				
				System.out.println("El numero es: " + "Catorce");
				
			break;
				
			case 5:
				
				System.out.println("El numero es: " + "Quince");
				
			break;
				
			case 6:
				
				System.out.println("El numero es: " + "Dieciseis");
				
			break;
				
			case 7:
				
				System.out.println("El numero es: " + "Diecisiete");
				
			break;
				
			case 8:
				
				System.out.println("El numero es: " + "Dieciocho");
				
			break;
				
			case 9:
				
				System.out.println("El numero es: " + "Diecinueve");
				
			break;
			
			default:
				System.out.println("La opcion no es valida");
		}
		

	}

}
}
