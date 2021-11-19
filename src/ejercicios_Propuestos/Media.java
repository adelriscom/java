package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma, num, media=0, i;
		suma = 0;
		i = 0;
	
		
		do {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			
			if(num >= 0) {
				
				i++;				
				suma = suma + num;
				media = suma/i;
				
			}
			
			
		}while(num >= 0);
		
		System.out.println("La Media de los numeros ingresados es: " + media);
		System.out.println("Ud. ha ingresado el numero: " + num + " el juego ha terminado!!");

	}

}
