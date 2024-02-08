package Tema5_23_24.Ejercicio_Call_of_Duty;

import java.util.Scanner;

public class Init {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       

	        int opcion;
	        do {
	            System.out.println("═══════════════════════════════════════");
	            System.out.println("             Menú Principal            ");
	            System.out.println("═══════════════════════════════════════");
	            System.out.println("1. Ver inventario");
	            System.out.println("2. Añadir arma o accesorio");
	            System.out.println("3. Equipar/Desequipar");
	            System.out.println("4. Cambiar arma secundaria");
	            System.out.println("5. Cambiar arma principal");
	            System.out.println("6. Ver accesorios de un arma");
	            System.out.println("0. Salir del programa");
	            System.out.println("═══════════════════════════════════════");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    // Llamar al método para mostrar inventario
	                    break;
	                case 2:
	                    // Llamar al método para añadir arma o accesorio
	                    break;
	                case 3:
	                    // Llamar al método para equipar/desequipar
	                    break;
	                case 4:
	                    // Llamar al método para cambiar arma secundaria
	                    break;
	                case 5:
	                    // Llamar al método para cambiar arma principal
	                    break;
	                case 6:
	                    // Llamar al método para ver accesorios de un arma
	                    break;
	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
	            }
	        } while (opcion != 0);

	        scanner.close();
	    }
}

