package programas_u1_poo;

import java.util.Scanner;

public class Programa3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		byte edad;
		float estatura;
		
		Scanner leer = new Scanner(System.in) ;
		
		System.out.print("Ingresa tu nombre");;
		nombre= leer.nextLine();
		System.out.print("Ingresa tu edad");
		edad = leer.nextByte();
		System.out.print("Ingresa tu estatura");
		estatura = leer.nextFloat();
		

		
		Persona a =new Persona ();
		
				a.setNombre(nombre);
				a.setEdad(edad);
				a.setEstatura(estatura);
				
				System.out.println(a);
				
				
				
	}

}
