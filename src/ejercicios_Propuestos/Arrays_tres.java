package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Arrays_tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector1[] = new int[10];
		int vector2[] = new int[10];
		int vector3[] = new int[20];
		int i, j, y, z;
		
		for(i=0; i<10; i++) {
			
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i + " para el vector 1"));
			vector1[i] = num;
			
		}
		
		for(j=0; j<10; j++) {
				
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
		z=0;
		
		for(y=0; y<10; y++) {
			
			vector3[z]=vector1[i];
			z++;
			vector3[z]=vector2[j];
			z++;
			i++;
			j++;
			
		}
		
		System.out.print("\n");
		
		for(int vector:vector3) {
			
			System.out.print(vector + " ");
		}
	}
		

}


