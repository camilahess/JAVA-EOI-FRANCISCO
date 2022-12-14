package colecciones;
import java.util.Arrays;
import java.util.Scanner;

public class EjemplosArrays {
	
	private static void ejemplo1() {
		// String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }
		int a;
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		int[] numeros = new int[5]; // de la posición 0 a la 4.
		// Asignación de valores a los elementos de un array
		numeros[0] = 3;
		numeros[1] = 4;
		numeros[2] = -1;
		numeros[3] = 4;
		numeros[4] = 4;
		int[] numeros2 = { 4, 7, 8, 9 };
		// numeros[5] = 1; // Error
		System.out.println("La suma da: " + (numeros[1] + numeros[2]));
		// System.out.println("La suma da: " + numeros); // No tiene sentido

		// meses[0] = "Enero";
		System.out.println(meses[1]);
		System.out.println(meses[11]);
		for (int i = 0; i < meses.length; i++) { // recorro todos los meses
			System.out.println(meses[i] + " es el mes " + (i + 1));
		}

		// No sé la posición
		for (String mes : meses) {
			System.out.println(mes);
		}

		int numeroMes = 1;
		for (String mes : meses) {
			System.out.println(mes + " es el mes " + numeroMes);
			numeroMes++;
		}

		// Buscar un elemento dentro del Array

		// Opción 1:

		boolean encontrado = false;
		String mesBuscado = "Enerooooo";
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < meses.length && !encontrado; i++) {
			if (meses[i].equals(mesBuscado)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado...");
		}

		// Opción 2

		if (Arrays.stream(meses).anyMatch(n -> n.equals(mesBuscado))) { //programación funcional 
			System.out.println("El nombre " + mesBuscado + " está en el array");
		} else {
			System.out.println(mesBuscado + " no encontrado...");
		}

		// Busca un número negativo en el cojunto del array
		// Siempre que aparezca '->' estamos con programación funcional
		if (Arrays.stream(numeros).anyMatch(numero -> numero < 0)) {
			System.out.println("Hay algún número negativo");
		} else {
			System.out.println("Todos los números son positivos");
		}

		if (Arrays.stream(numeros).allMatch(numero -> numero >= 0)) {
			System.out.println("Todos los números son positivos");
		} else {
			System.out.println("Hay algún número negativo");
		}

	}

	public static void ordenarArrays() {
		int[] nums = { 15, 6, 9, 12, 20 };
		
		// Algoritmo de la burbuja
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) { // Intercambiamos
					int aux = nums[i];
					nums[i] = nums[j];
					nums[j] = aux;
				}
			}
		}
		
		for(int numero : nums) {
			System.out.println(numero);
		}

	}
	
	public static void ordenarArrays2() {
		int[] nums = { 15, 6, 9, 12, 20 };
		Arrays.sort(nums);  // Me ordena el array
		System.out.println(Arrays.toString(nums)); // [6, 9, 12, 15, 20] (Ordenados)
	}
	
	public static void ordenarArrays3() {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" }; // Del 0 al 11
		Arrays.sort(meses);  // Orden lexicográfico con sort
		System.out.println(Arrays.toString(meses));
	}
	
	
	
	
	public static void arraysMultidimensionales() {
		// Ejemplo de tabla no escalonada
		int[][] tabla = new int[4][3]; // crear el array y darle memoria
		tabla[0][0] = 5;
		tabla[0][1] = 4;
		tabla[0][2] = 9;
		tabla[1][0] = 8;
		tabla[1][1] = 5;
		tabla[1][2] = 1000;
		tabla[2][0] = -2;
		tabla[2][1] = 14;
		tabla[2][2] = 5;
		tabla[3][0] = 9;
		tabla[3][1] = 0;
		tabla[3][2] = 8;
		int[][] tabla2 = { { 5, 4, 9 }, { 8, 5, 1000 }, { -2, 14, 5 }, { 9, 0, 8 } }; // es lo mismo que lo de arriba

		// recorrer las tablas
		//int alto = tabla.length;
		//int ancho = tabla[0].length;
		for (int fila = 0; fila < tabla.length; fila++) { 
			// Mensajes antes de cada fila
			//System.out.println("Tratamiento de la fila: " + fila);
			for (int col = 0; col < tabla[fila].length; col++) {
				System.out.print(tabla[fila][col] + " ");
			}
			// Mensajes al final de cada fila
			// System.out.println("\nFin de la fila: " + fila); // Generamos salto de línea
			System.out.println();
		}
		// Mensajes al final de la tabla

	}
	
	
	
	
	
	public static void main(String[] args) {
		ejemplo1();
		
	

	}

}
