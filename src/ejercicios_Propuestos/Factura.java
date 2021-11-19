package ejercicios_Propuestos;

import javax.swing.JOptionPane;

public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codArticulo, factMayor, i;
		double cantVendLitros=0, precLitro, totalFact, totalFact1=0, totalFact2=0, totalFact3=0, totalFact4=0, totalFact5=0, cantVendArt1=0;
		
		int articulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de articulos"));
		System.out.println("El numero de articulos es: " + articulos);
		
		for(i=0; i<=5; i++) {
			
			if(i==1) {
				
				int articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo"));
				codArticulo = articulo;
				System.out.println("Codigo articulo: " + codArticulo);
				
				double cantVendLitr = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del articulo"));
				cantVendLitros = cantVendLitr;
				System.out.println("Cantidad vendida por litro: " + cantVendLitros);
				
				double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro"));
				precLitro = precioLitro;
				System.out.println("Precio por litro: " + precLitro);
				
				totalFact1 = cantVendLitros * precLitro;
			}
			
			else if(i==2) {
				
				int articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo"));
				codArticulo = articulo;
				System.out.println("Codigo articulo: " + codArticulo);
				
				double cantVendLitr = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del articulo"));
				cantVendLitros = cantVendLitr;
				System.out.println("Cantidad vendida por litro: " + cantVendLitros);
				
				double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro"));
				precLitro = precioLitro;
				System.out.println("Precio por litro: " + precLitro);
				
				totalFact2 = cantVendLitros * precLitro;
				
			}
			else if(i==3) {
				
				int articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo"));
				codArticulo = articulo;
				System.out.println("Codigo articulo: " + codArticulo);
				
				double cantVendLitr = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del articulo"));
				cantVendLitros = cantVendLitr;
				System.out.println("Cantidad vendida por litro: " + cantVendLitros);
				
				double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro"));
				precLitro = precioLitro;
				System.out.println("Precio por litro: " + precLitro);
				
				totalFact3 = cantVendLitros * precLitro;
				
			}
			else if(i==4) {
				
				int articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo"));
				codArticulo = articulo;
				System.out.println("Codigo articulo: " + codArticulo);
				
				double cantVendLitr = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del articulo"));
				cantVendLitros = cantVendLitr;
				System.out.println("Cantidad vendida por litro: " + cantVendLitros);
				
				double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro"));
				precLitro = precioLitro;
				System.out.println("Precio por litro: " + precLitro);
				
				totalFact4 = cantVendLitros * precLitro;
				
			}
			else if(i==5) {
				
				int articulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del articulo"));
				codArticulo = articulo;
				System.out.println("Codigo articulo: " + codArticulo);
				
				double cantVendLitr = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad vendida del articulo"));
				cantVendLitros = cantVendLitr;
				System.out.println("Cantidad vendida por litro: " + cantVendLitros);
				
				double precioLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro"));
				precLitro = precioLitro;
				System.out.println("Precio por litro: " + precLitro);
				
				totalFact5 = cantVendLitros * precLitro;
				
			}
			else {
				
				System.out.println("El numero de factura es mayor a 5");
			}
			
		}
		
		totalFact = totalFact1 + totalFact2 + totalFact3 + totalFact4 + totalFact5;
		System.out.println("El total de la factura es: " + totalFact);
		System.out.println("El total del articulo 1 es: " + cantVendLitros);
		
		

	}

}
