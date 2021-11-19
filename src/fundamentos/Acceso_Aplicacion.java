package fundamentos;

import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Alexander";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrasena, por favor");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contrasena incorrecta");
			}
			
		}
		System.out.println("Contrasena correcta. Acceso permitido");

	}

}
