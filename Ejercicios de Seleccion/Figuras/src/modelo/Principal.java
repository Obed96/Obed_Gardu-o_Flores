package modelo;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int opcion;
		int seleccion = 0;
		do {
			Cubo c = new Cubo(0.0, 0.0);
			Cuadrado cua =new Cuadrado(0.0, 0.0);
			System.out.println("Ingrese el valor del lado:");
			cua.setCuadrado(sc.nextDouble());
			c.setCubo(cua.getCuadrado());
			System.out.println("Elija la figura  que desea :\n"
					+ "1.- Cuadrado\n"
					+ "2.- Cubo\n"
					+ "3.-Salir\n"
					+ "4.-Cancelar\n"
					+ "5-.Saber el digito tecleado");
					
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:	
				do {
					
					
				System.out.println("Que desea calcular del cuadrado:\n "
						+ "1-. Area\n"
						+ "2-. Perimetro\n"
						+ "3-. Ambos\n"
						+ "4-. Regresar a pedir un numero\n"
						+ "5-.salir\n"
						+ "6-. Saber el digito tecleado:"
						);
				seleccion=sc.nextInt();
				
				
				if (seleccion==1) {
					System.out.println("El area del cuadrado es:"+cua.calcular_Area());
					System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
							+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
							+ "Presiona 5 Para Salir");
				seleccion=sc.nextInt();
				
				
				}else if (seleccion==2) {
					System.out.println("El perimetro de el cuadrado es: "+cua.calcular_Perimetro());
					System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
							+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
							+ "Presiona 5 Para Salir");
				seleccion=sc.nextInt();
					
					
				}else if (seleccion==3) {
					
					System.out.println("El area de el cuadrado es:"+cua.calcular_Area());				
					System.out.println("El perimetro de el cuadrado es:"+cua.calcular_Perimetro());
					System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
							+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
							+ "Presiona 5 Para Salir");
				seleccion=sc.nextInt();
					
				}else if (seleccion==4) {

				}
				else if (seleccion==5) {
					System.exit(5);
					
					
				}else if (seleccion==6) {
					System.out.println("el digito tecleado es:"+cua.getCuadrado());
					System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
							+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
							+ "Presiona 5 Para Salir");
				seleccion=sc.nextInt();
				}

				}while (seleccion==7 );
				break;
				
			case 2:
				do {

				System.out.println("Que desea calcular del cubo:\n "
					+ "1-. Volumen\n"
					+ "2-. Perimetro\n"
					+ "3-. Ambos\n"
					+ "4-. Regresar a pedir un numero\n"
					+ "5-.salir\n"
					+ "6-. Saber el digito tecleado:"
					);
			seleccion=sc.nextInt();
			
			
			if (seleccion==1) {
				System.out.println("El volumen del cubo es:"+c.calcular_Area());
				System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
				+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
				+ "Presiona 5 Para Salir");
			seleccion=sc.nextInt();
			
			
			}else if (seleccion==2) {
				System.out.println("El perimetro de el cubo es: "+c.calcular_Perimetro());
				System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
				+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
				+ "Presiona 5 Para Salir");
			seleccion=sc.nextInt();
				
				
			}else if (seleccion==3) {
				
				System.out.println("El volumen de el cubo es:"+c.calcular_Area());				
				System.out.println("El perimetro de el cubo es:"+c.calcular_Perimetro());
				System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
				+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
				+ "Presiona 5 Para Salir");
			seleccion=sc.nextInt();
				
			}else if (seleccion==4) {

			}
			else if (seleccion==5) {
				System.exit(5);
				
				
			}else if (seleccion==6) {
				System.out.println("el digito tecleado es:"+cua.getCuadrado());
				System.out.println(" Presiona 7 Para Seguir Haciendo Calculos En El Submenu\n"
				+ "Presiona 4 Para Pedir Un Nuevo Numero\n"
				+ "Presiona 5 Para Salir");
			seleccion=sc.nextInt();
			}

			}while (seleccion==7 );
			break;
					
			
			case 3:
				System.exit(3);

				break;	
			
			
			case 5:
				System.out.println("el digito tecleado es:"+cua.getCuadrado());
				
				System.out.println(" presiona 4 para seguir haciendo calculos\n"
				+ "presiona 3 para salir");
				opcion=sc.nextInt();
				break;
			}

		} while (opcion==4 || seleccion==4 );
		System.out.println("Vuelva Pronto");

	}

}
