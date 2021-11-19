package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Sueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sueldo, i, suma=0, y=0;
		
		for(i=0; i<10; i++) {
			
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo"));
			
			if(sueldo > 1000) {
				y++;
			}
			
			suma = suma + sueldo;
		}
		
		System.out.println("La suma de los sueldos es: " + suma);
		System.out.println("Los sueldos por encima de 1000 euros son: " + y);

	}

}
