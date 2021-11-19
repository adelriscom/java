package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad, i, y=1, z=1;
		double altMed=0, altura=0, sumA=0;
		int  edMed=0, aMay=0, aalt=0, sumE=0;
		
		for(i=1; i<=5; i++) {
			
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"+ " " + i));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"+ " " + i));
			
			sumE = sumE + edad;
			edMed = sumE/y;
			
			sumA = sumA + altura;
			altMed = sumA/z;
			
			if(edad > 18) {
				
				aMay++;
			}
			if(altura > 1.75) {
				
				aalt++;
			}
			
			y++;
			z++;
		}
		
		System.out.println("La edad media es: " + edMed);
		System.out.printf("La altura media es: %1.2f  " , altMed);
		System.out.println("\n"+"Alumnos mayores a 18 anos: " + aMay);
		System.out.println("Alumnos altura mayor a 1.75 cms: " + aalt);
		
		

	}

}
