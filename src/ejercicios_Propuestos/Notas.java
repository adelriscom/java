package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota de 0 a 10"));
		System.out.println("La nota ingresada es: " + nota);
		
		if(nota>= 0 && nota<=5) {
			
			System.out.println("Ud ha obtenido una nota INSUFICIENTE de: " + nota );
		}
		else if(nota >= 6 && nota <=8) {
			
			System.out.println("Ud ha obtenido una nota SUFICIENTE de: " + nota );
		}
		else {
			
			
			System.out.println("Ud ha obtenido una nota BUENA de: " + nota );
		}
		
	}

}
