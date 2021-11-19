package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Media_PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, i;
		int medPos=0, sum=0;
		int medNeg=0, sum1=0;
		int x=0, y=0, z=0;
		
		for(i=0; i<10; i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: negativo, positivo o cero"));
			
			if(num > 0) {
				y++;
				sum = sum+num;
				medPos = sum/y;
				
			}
			else if(num < 0) {
				
				x++;
				sum1 = sum1+num;
				medNeg = sum1/x;
			}
			else {
				z++;
				sum = z;
			}
			
		}
		System.out.println("La media de numeros positivos es: " + medPos);
		System.out.println("La media de numeros negativos es: " + medNeg);
		System.out.println("El numero de ceros es: " + z);
		
		

	}

}
