package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Vectores_DeATres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector1[] = new int[12];
		int vector2[] = new int[12];
		int vector3[] = new int[24];
		int i, j, y, z=0;
		
		for(i=0; i<12; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i + " para el vector 1"));
			vector1[i] = num;
			
		}
		
		for(j=0; j<12; j++) {
				
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + j + " para el vector 2"));
				vector2[j] = num1;
		}
		
		
		for(int vector:vector1) {
			
			System.out.print(vector + " ");
		}
		
		System.out.print("\n");
		
		for(int vector:vector2) {
			
			System.out.print(vector + " ");
		}
		
		i=0;
		j=0;
		y=0;
		
		while(i<12) {
			
			for(int k=0; k<3; k++) {
				
				vector3[z]=vector1[i+k];
				z++;
			}
			
			for(int k=0; k<3; k++) {
				
				vector3[z]=vector2[i+k];
				z++;
			}
				
			i+=3;
				
		}
		
		System.out.print("\n");
		
		for(int vector:vector3) {
			
			System.out.print(vector + " ");
		}

	}

}
