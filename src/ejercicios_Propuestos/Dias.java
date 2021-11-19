package ejercicios_Propuestos;

import java.util.Scanner;

public class Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total_dias;
		
		Scanner fecha = new Scanner(System.in);
		System.out.println("Esta ejercicio verifica la diferencia en dias de dos fechas");
		
		System.out.println("Ingrese el primer dia");
		int dia1 = fecha.nextInt();
		
		System.out.println("Ingrese el primer mes");
		int mes1 = fecha.nextInt();
		
		System.out.println("Ingrese el primer año");
		int año1 = fecha.nextInt();
		
		System.out.println("Ingrese el segundo dia");
		int dia2 = fecha.nextInt();
		
		System.out.println("Ingrese el segundo mes");
		int mes2 = fecha.nextInt();
		
		System.out.println("Ingrese el segundo año");
		int año2 = fecha.nextInt();
		
		total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
		System.out.println ("Días de diferencia: " + total_dias);

	}

}
