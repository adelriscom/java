package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Insertar_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t[] = new int[10];
		int num,sitio_num,j;

		for (int i=0;i<5;i++){

			int n = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el numero: " + i));
			t[i] = n;

		}
		
		System.out.println();

		num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a insertar entre los anteriores"));

		sitio_num=0;
		j=0;
		
		//buscaremos el sitio donde debería ir num
		
		while(t[j] < num && j<=4){
			sitio_num ++;
			j++;
		}
		
		//desplazaremos los elementos desde el sitio_num hasta el final
		//así haremos un hueco para num

		for (int i=4; i>=sitio_num; i--)
			t[i+1]=t[i];
		// por último ponemos num en su sitio para que todo siga ordenado
		t[sitio_num] = num;
		
		System.out.print("La nueva serie ordenada queda: ");
		
		for (int i=0;i<5+1;i++)
			System.out.print(t[i] + " ");

	}

}
