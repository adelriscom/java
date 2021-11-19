package poo;

//import javax.swing.JOptionPane;

public class Numero_Mayor {
	
	private int numeros[], max;
	
	public Numero_Mayor(int n) {
		
		System.out.println("El arreglo contendra: " + n + " elementos");
		numeros = new int[n];
	}
	
	
	
	public String getMayor() {
		
		for(int i=0; i<numeros.length; i++) {
			
			numeros[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for(int i=0; i < numeros.length; i++) {
			
			if(numeros[i]>max) {
				
				max = numeros[i];
			}
		}
		
		for(int v:numeros) {
			
			System.out.print(v + " ");
		}
		
		System.out.println(" ");
		return "El numero mayor es: " +max;
	}

}
