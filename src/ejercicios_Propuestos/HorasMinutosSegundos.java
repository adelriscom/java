package ejercicios_Propuestos;

import java.util.*;

public class HorasMinutosSegundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner horas = new Scanner(System.in);
		System.out.println("Este ejercicio pretende mostrar una hora ingresada por el usuario "
				+ "un segundo despues" + "\n");
		
		System.out.println("Ingresa la hora: debe ser de 0 a 24 el valor ingresado");
		int hora = horas.nextInt();
		
		System.out.println("Ingresa los minutos: debe ser de 1 a 60 el valor ingresado");
		int minutos = horas.nextInt();
		
		System.out.println("Ingresa los segundos: debe ser de 1 a 60 el valor ingresado");
		int segundos = horas.nextInt();
		
		if((segundos >=1 || segundos <=60) && (minutos <= 60) && (hora <= 24)) {
			
			System.out.println("La hora ingresada es: " + hora + " : " + minutos + " : " + segundos);
		}
		else if(segundos > 60 && hora <= 24) {
			
			System.out.println("La hora es: " + hora + " : " + (minutos - 60) + " : " + (segundos - 60));
		}
		else if((segundos >=1 || segundos <=60) && (minutos > 60)) {
			
			System.out.println("La hora es: " + (hora+1) + " : " + (minutos - 60) + " : " + segundos );
		}
		

		

	}

}
