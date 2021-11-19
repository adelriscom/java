package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Estado_Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aprobado, condicionado, suspenso, i, x=0, y=0, z=0;
		
		for(i=1; i<=6; i++) {
			
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota: " + i));
			
			if(nota < 4) {
				x++;
			}
			else if(nota == 4) {
				y++;
			}
			else {
				z++;
			}
		}
		
		System.out.println("Los alumnos aprobados son: " + z);
		System.out.println("Los alumnos condicionados son: " + y);
		System.out.println("Los alumnos suspenso son: " + x);
		
		

	}

}
