package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner input = new Scanner(System.in);

	public static byte leerByte(String mensaje) {
		
		byte num=0;
		boolean variable;
		
		do {
			try {
				System.out.println(mensaje);
				num=input.nextByte();
				System.out.println(num+" es el byte introducido");
				variable=true;
			
			}catch(InputMismatchException e) {
				System.out.println("Error de formato");
				variable=false;
			}
			String limpieza=input.nextLine();
			
		}while(!variable);
		
		
		return num;
	}
	public static int leerInt(String mensaje) {
		
		
		int num=0;
		boolean variable;
		
		do {
			try {
				System.out.println(mensaje);
				num=input.nextInt();
				System.out.println(num+" es el integer introducido");
				variable=true;
			}catch(InputMismatchException e) {
				System.out.println("Error de formato");
				variable=false;			
			}
			String limpieza=input.nextLine();
			
		}while(!variable);
		
		return num;
		
	}
	
	public static float leerFloat(String mensaje) {
		
		float num = 0;
		boolean variable;
		do {
			
			try {
				System.out.println(mensaje);
				num=input.nextFloat();
				System.out.println(num+" es el float introducido");
				variable=true;
			}catch(InputMismatchException e) {
				System.out.println("Error de formato");
				variable=false;			
			}
			String limpieza=input.nextLine();
		}while(!variable);
		
		return num;
		
	}
	public static double leerDouble(String mensaje) {
		
		double num=0;
		boolean variable;
		do {
			
			try {
				System.out.println(mensaje);
				num=input.nextDouble();
				System.out.println(num+" es el double introducido");
				variable=true;

			}catch(InputMismatchException e) {
				System.out.println("Error de formato");
				variable=false;
			}
			String limpieza=input.nextLine();
		}while(!variable);

		return num;
		
	}
	public static char leerChar(String mensaje) {
		boolean opcion = false;
		String charIntroducido = null;
		
		do {
			System.out.println(mensaje); 
			try {
				charIntroducido = input.next(); 
				if (charIntroducido.length() != 1) {
					throw new Exception(); 
				} else {
					System.out.println(charIntroducido+" es el char introducido");
					opcion = true; 
				}
			} catch (Exception e) {
				System.out.println("Error de formato");
			}
		} while (!opcion);
		input.nextLine();
		char charFinal = charIntroducido.charAt(0);
		return charFinal; 
	}
	public static String leerString(String mensaje) {
		boolean opcion = false;
		String stringIntroducido = null;
		
		do {
			System.out.println(mensaje); 
			try {
				stringIntroducido = input.nextLine(); 
				if (stringIntroducido.length() >9) {
					throw new Exception(); 
				} else {
					System.out.println(stringIntroducido + " es el string introducido");
					opcion = true; 
				}
			} catch (Exception e) {
				System.out.println(" Error de formato, el texto máximo ha introducir es 9");
			}
		} while (!opcion);
		
		
		return stringIntroducido; 
	
	}
	public static boolean leerSiNo(String mensaje) {

		boolean opcion = false;
		String stringIntroducido;
		
		
		do {
			System.out.println(mensaje); 
		
			try {
						
				stringIntroducido = input.nextLine().toLowerCase();
				if(stringIntroducido.equals("s")){
					opcion = true; 
					System.out.println("true");
				}else if(stringIntroducido.equals("n")){
					System.out.println("false");
					opcion = true; 
				}else {
					throw new Exception(); 
				} 
			}catch (Exception e) {
				System.out.println("Error de formato");
			}
			
		}while(!opcion);
		
	return opcion;
		
	}
}
			
		
	

