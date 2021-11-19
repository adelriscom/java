package ejercicios_Propuestos;


import javax.swing.JOptionPane;

		public class TresNumeros_MayorMenor {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				String num1 = JOptionPane.showInputDialog("Por favor ingrese el primer numero");
				int a = Integer.parseInt(num1);
				
				String num2 = JOptionPane.showInputDialog("Por favor ingrese el segundo numero");
				int b = Integer.parseInt(num2);
				
				String num3 = JOptionPane.showInputDialog("Por favor ingrese el tercer numero");
				int c = Integer.parseInt(num3);
				
				if(a > b && b > c) {
					
					System.out.println("El numero " + a + " es mayor que el numero " + b + " y " + " El numero " + b + " es mayor que el numero " + c);
					System.out.println(a+ ","+ b + "," + c);
				}
				else if(a > c && c > b) {
					
					System.out.println("El numero " + a + " es mayor que el numero " + c + " y " + " El numero " + c + " es mayor que el numero " + b);
					System.out.println(a+ ","+ c + "," + b);
				}
				else if(b > a && a > c) {
					
					System.out.println("El numero " + b + " es mayor que el numero " + a + " y " + " El numero " + a + " es mayor que el numero " + c);
					System.out.println(b+ ","+ a + "," + c);
				}
				else if(c > a && a > b) {
					
					System.out.println("El numero " + c + " es mayor que el numero " + a + " y " + " El numero " + a + " es mayor que el numero " + b);
					System.out.println(c+ ","+ a + "," + b);
				}
				else if(c > b && b > a) {
					
					System.out.println("El numero " + c + " es mayor que el numero " + b + " y " + " El numero " + b + " es mayor que el numero " + a);
					System.out.println(c+ ","+ b + "," + a);
				}
				else {
					
					System.out.println("Los numeros son iguales: " + a + " , " + b + " , " + c);
					System.out.println(c+ ","+ a + "," + b);
				}

	}

}
