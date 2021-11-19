package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  fila, columna, lado;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitid del lado del cuadrado"));
		
		for(fila=1; fila<=lado; fila++)
		{
						
			for(columna=1; columna<=lado; columna++)
				if((fila==columna || fila==lado) || (columna>fila && fila==1))
					System.out.print("* ");
					//System.out.println(fila + " " + columna);
				System.out.println("");
				
		}
								
	}
			
}
						
	




