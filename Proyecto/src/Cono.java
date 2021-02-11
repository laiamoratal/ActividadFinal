import java.util.Scanner;


//programa que calcula el volumen de un cono 
	/**
	 * @author Laia Moratal
	 */

public class Cono {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double PI= 3.141592654;
		// En el lugar de definir una constante se podría usar
		// la constante predefinida Math.PI
		System.out.println("Volumen de un cono");
		
		/**
		 * @param h altura del cono 
		 */
		System.out.println("Por favor, introduzca la altura (cm): ");
		double h = scan.nextDouble();
		/**
		 * @param radio del cono
		 */
		System.out.println("Introduzca el radio (cm): ");
		double r = scan.nextDouble();
		
		/**
		 * @param v realización de la operacion con los datos anteriores
		 */
		double v = (1.0/3.0) * PI * r * r * h;
		
		System.out.println("El volumen del cono es de "+ v + "cm3");
	}

}
