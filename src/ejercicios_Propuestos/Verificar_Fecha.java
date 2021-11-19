package ejercicios_Propuestos;

import java.util.*;
import javax.swing.JOptionPane;

public class Verificar_Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dias = new Scanner(System.in);
		System.out.println("Elige una opcion: \n1: Domingo \n2: Lunes \n3: Martes \n4: Miercoles \n5: Jueves \n6: Viernes \n7: Sabado");
		
		int dia_semana=dias.nextInt();
		
		switch(dia_semana) {
		
		case 1:
			
			System.out.println("El dia seleccionado fue Domingo");
			break;
		
		case 2:
			
			System.out.println("El dia seleccionado fue Lunes");
			break;
		
		case 3:
			
			System.out.println("El dia seleccionado fue Martes");
			break;
			
		case 4:
			
			System.out.println("El dia seleccionado fue Miercoles");
			break;
			
		case 5:
			
			System.out.println("El dia seleccionado fue Jueves");
			break;
			
		case 6:
			
			System.out.println("El dia seleccionado fue Viernes");
			break;
			
		case 7:
			
			System.out.println("El dia seleccionado fue Sabado");
			break;
		
		default:
			
			System.out.println("La opcion seleccionada es incorrecta");
		}
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: el dia debe ser de 1 a 31"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: el mes debe ser de 1 a 12"));
		
		switch(mes) {
		
			case 1:
			
			System.out.println("El mes seleccionado fue Enero");
			break;
		
			case 2:
			
			System.out.println("El mes seleccionado fue Febrero");
				if(dia>0 && dia<=28) {
					
					System.out.println("El dia es: " + dia);
					System.out.println("El dia siguiente es: " + (dia +1));
				}
			break;
		
			case 3:
			
			System.out.println("El mes seleccionado fue Marzo");
			break;
			
			case 4:
			
			System.out.println("El mes seleccionado fue Abril");
				if(dia!=31) {
				
					System.out.println("El dia es: " + dia);
					System.out.println("El dia siguiente es: " + (dia +1));
				}
			break;
			
			case 5:
			
			System.out.println("El mes seleccionado fue Mayo");
			break;
			
			case 6:
			
			System.out.println("El mes seleccionado fue Junio");
				if(dia!=31) {
				
					System.out.println("El dia es: " + dia);
					System.out.println("El dia siguiente es: " + (dia +1));
				}
			break;
			
			case 7:
			
			System.out.println("El mes seleccionado fue Julio");
			break;
		
			case 8:
			
			System.out.println("El mes seleccionado fue Agosto");
			break;
			
			case 9:
				
			System.out.println("El mes seleccionado fue Septiembre");
				if(dia!=31) {
					
					System.out.println("El dia es: " + dia);
					System.out.println("El dia siguiente es: " + (dia +1));
				}
				break;
				
			case 10:
				
				System.out.println("El mes seleccionado fue Octubre");
				break;
				
			case 11:
				
				System.out.println("El mes seleccionado fue Noviembre");
				break;
				
			case 12:
				
				System.out.println("El mes seleccionado fue Diciembre");
				break;
			
		default:
			
			System.out.println("La opcion seleccionada es incorrecta");
		}
		
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ango: el ango debe ser de cuatro digitos"));
		
		System.out.println("El ango ingresado fue: " + ano);
		
		
		

		
		if(mes==1) {
			if(dia==31) {
				System.out.println("El dia es 31 de Enero");
			}
			else {
				System.out.println("El dia es: " + dia + " de Enero");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Enero");
			}
			
		}
		else if(mes==3) {
			if(dia==31) {
				System.out.println("El dia es 31 de Marzo");
			}
			else {
				System.out.println("El dia es: " + dia + " de Marzo");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Marzo");
			}
			
		}
		else if(mes==5) {
			if(dia==31) {
				System.out.println("El dia es 31 de Mayo");
			}
			else {
				System.out.println("El dia es: " + dia + " de Mayo");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Mayo");
			}
			
		}
		else if(mes==7) {
			if(dia==31) {
				System.out.println("El dia es 31 de Julio");
			}
			else {
				System.out.println("El dia es: " + dia + " de Julio");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Julio");
			}
			
		}
		else if(mes==8) {
			if(dia==31) {
				System.out.println("El dia es 31 de Agosto");
			}
			else {
				System.out.println("El dia es: " + dia + " de Agosto");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Agosto");
			}
			
		}
		else if(mes==10) {
			if(dia==31) {
				System.out.println("El dia es 31 de Octubre");
			}
			else {
				System.out.println("El dia es: " + dia + " de Octubre");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Octubre");
			}
			
		}
		else if(mes==12) {
			if(dia==31) {
				System.out.println("El dia es 31 de Diciembre");
			}
			else {
				System.out.println("El dia es: " + dia + " de Diciembre");
				System.out.println("El dia siguiente es: " + (dia +1) + " de Diciembre");
			}
			
		}
	}
	
	

}
