package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class N_Sueldos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		float sueldoMax=0;
		
		int nSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		for(i=1; i <= nSueldos; i++) {
			
			int miSueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sueldo " + i));
			
			sueldoMax=miSueldo;
			
		}
		
		System.out.println("El sueldo maximo es: " + sueldoMax);
	}

}
