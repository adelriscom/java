package ejercicios;

//import javax.swing.JOptionPane;

public class Numeros {
	
	private int numero1;
	private int numero2;
	
	public Numeros() {
		
		//numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		//numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		numero1=0;
		numero2=0;
	}
	
	
	public int numeros(int numero1, int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
		
		return numero1 + numero2;
		
	}
	public String comparar_numeros() {
		
		if(numero1==numero2) {
			
			return "El numero: " + numero1 + " y el numero: " + numero2 + " son iguales ";
			
		}else{
			
			return "El numero: " + numero1 + " y el numero: " + numero2 + " son diferentes ";
			
			
		}
		
	}

}
