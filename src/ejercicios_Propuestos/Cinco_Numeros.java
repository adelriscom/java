package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Cinco_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = new int[5];
		int i, x=0, y=0, z=0, sum1=0, sum2=0, medPos=0, medNeg=0;
		
		for(i=0; i<5; i++) {
			
			int dat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numro"));
			num[i]=dat;
			
			if(dat>=0) {
				y++;
				sum1=sum1+dat;
				medPos=sum1/y;
			}
			else if(dat<0) {
				z++;
				sum2=sum2+dat;
				medPos=sum2/z;
			}
			else {
				x++;
				
							
			}
			
			System.out.print(num[i] + " ");
			
		}
		System.out.println(" ");
		System.out.print(num[4] + " ");
		System.out.print(num[3] + " ");
		System.out.print(num[2] + " ");
		System.out.print(num[1] + " ");
		System.out.print(num[0] + " ");
		System.out.println("El numero de ceros ingresados es: " + x);
		System.out.println("La media de numeros positivos es: " + y);
		System.out.println("La media de numeros negativos es: " + z);
		
		

	}

}
