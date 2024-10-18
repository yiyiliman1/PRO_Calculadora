package switchcase;

import java.util.Scanner;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// el programa pide al usuario 2 numeros y una operacion, las operaciones posibles son sumas, resta, multiplicacion y division.
		// el programa muestra el resultado de la operacion sobre los numeros introducidos

		double numero1;
		double numero2;
		int operacion;
		
		
		System.out.print("Introduce el primer número: ");
		numero1 = entrada.nextDouble();
		System.out.print("Introduce el segundo número: ");
		numero2 = entrada.nextDouble();
		System.out.print("elige la operación:\n"
				+ "1. Opción 1: suma\n"
				+ "2. Opción 2: resta\n"
				+ "3. Opción 3: multiplicacion\n"
				+ "4. Opción 4: division\n"
				+ "5. Opción 5: salir\n"
				+">> ");
		operacion = entrada.nextInt();
		
		double resultadosuma = numero1+numero2;
		double resultadoresta = numero1-numero2;
		double resultadomulti = numero1*numero2;
		double resultadodivi = numero1/numero2;
		
		switch (operacion) {
		case 1:
			System.out.println("Has selecionado la suma: " + resultadosuma);
			resultadosuma = entrada.nextInt();
			break;
		case 2:
			System.out.println("Has selecionado la resta: " + resultadoresta);
			resultadoresta = entrada.nextInt();
			break;
		case 3:
			System.out.println("Has selecionado la multiplicaion: " + resultadomulti);
			resultadomulti = entrada.nextInt();
			break;
		case 4:
			System.out.println("Has selecionado la division: " + resultadodivi);
			resultadodivi = entrada.nextDouble();
			break;
		default :
			System.out.println("Has selecionado salir del sistema");
			
			
			
			
			
		}
		
		
	}

}
