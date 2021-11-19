package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, x=0, y=0, z=0;
		float calificacion;
		
		while(i<=5) {
			
			calificacion = Float.parseFloat(JOptionPane.showInputDialog("Introduzca una nota " + i));
			
			if(calificacion < 4) {
				
				x++;
			}
			else if(calificacion == 4) {
				
				y++;
			}
			else {
				z++;
			}
			
			i++;
			
		}
		System.out.println("Hay " + x + " alumnos suspensos");

	}

}
