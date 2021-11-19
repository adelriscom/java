package ejercicios_Propuestos;

public class Tabla_Multiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, n, mult=0;
		
		for(i=1; i<=10; i++) {
			
			for(n=1; n<=10; n++) {
				
				mult = i*n;
				
				System.out.println(i + " * " + n +  " = " + mult);
			}
			
			System.out.println(" ");
			
		}

	}

}
