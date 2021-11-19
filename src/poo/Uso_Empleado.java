package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  /*Empleado empleado1=new Empleado("Alexander Del Risco", 85000, 1990, 12, 17);
		Empleado empleado2=new Empleado("Marcela Falla", 95000, 1995, 06, 02);
		Empleado empleado3=new Empleado("Monica Del Risco", 105000,2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
		 + " Fecha de alta: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
		 + " Fecha de alta: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
		 + " Fecha de alta: " + empleado3.dameFechaContrato());
	  */
		
		// Codigo alternativo para ahorrar lineas de codigo
		
		Jefatura jefe_RRHH=new Jefatura("Nicolas", 55000, 2006, 9, 25);
		
		jefe_RRHH.setEstableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Alexander Del Risco", 85000, 1990, 12, 17);
		misEmpleados[1]=new Empleado("Marcela Falla", 95000, 1995, 06, 02);
		misEmpleados[2]=new Empleado("Monica Del Risco", 105000, 2002, 03, 15);
		misEmpleados[3]=new Empleado("Jorge Viafara");
		misEmpleados[4]=jefe_RRHH;
		misEmpleados[5]=new Jefatura("Maria", 95000, 1999, 5,26);
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
		jefa_Finanzas.setEstableceIncentivo(55000);
		
		
		
		//se comenta este bucle for para mostrar el uso del for mejorado
		/*for(int i=0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		jefa_Finanzas.establece_bonus(500);
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " + jefa_Finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].establece_bonus(200));
		
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		//se comenta este bucle for pra mostrar el uso del for mejorado
		/*for(int i=0; i<3; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
			 + " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
			
		}*/
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo()
					 + " Fecha de alta: " + e.dameFechaContrato());
		}
		

	}

}
//**********************************************************
// CLASE EMPLEADO
//**********************************************************
class Empleado implements Comparable, Trabajadores{
	
	//constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia ) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		++IdSiguiente;
		Id=IdSiguiente;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
		
	}
	
	
	public String dameNombre() {//GETTER
		
		return nombre + " Id: " + Id;
	}
	
	
	public double dameSueldo() {//GETTER
		
		return sueldo;
	}
	
	
	public Date dameFechaContrato() {//GETTER
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//SETTER
		
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	//DECLARACION DE ATRIBUTOS CLASE EMPLEADOS
//*************************************************
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente = 1;
//*************************************************	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.Id< otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
	}
}//FIN CLASE EMPLEADO
//**********************************************************
//**********************************************************

//**********************************************************
//**********************************************************
//INICIO CLASE JEFATURA
//**********************************************************
class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia); 
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un mienbro de la direccion ha tomado la decision de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base + gratificacion + prima;
	}
	
	public void setEstableceIncentivo(double b) {
		
		incentivo = b;
	}
	
	public double dameSueldo() {// se sobre escribe el metodo de la clase empleado, se indica con el triangulo verde 
		
		double sueldoJefe = super.dameSueldo();//se asigna el metodo del padre
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}//FIN CLASE JEFATURA
//**********************************************************

