package programas_u1_poo;
import java.util.Scanner;
public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-Men� principal-");
		System.out.println("Pulgadas a cent�metros");
		System.out.println("Pies a cent�metros");
		System.out.println("Pies a pulgadas");
		int opcion;
		double v1,v2,v3;
		Scanner leer = new Scanner (System.in);
		opcion = leer.nextInt();
		switch (opcion){
		case 1:
			System.out.println("Ingresa el valor en pulgadas:");
			pul = leer.nextDouble();
			pul = v1*2.54;
			System.out.println("En cent�metros es:"+v1);
			break;
		case 2:
			System.out.println("Ingresa el valor en pies");
			pies = leer.nextDouble();
			pies = v2*30.48;
			System.out.println("En cent�metros es:"+v2);
			break;
		case 3:
			System.out.println("Ingresa el valor en pies:");
			pie = leer.nextDouble();
			pie = v3*12;
			System.out.println(" En pulgadas es:"+v3);
			break;
			default:
				System.out.println("Ingresa un valor v�lido (1-3);");
			
		}
	}

}
