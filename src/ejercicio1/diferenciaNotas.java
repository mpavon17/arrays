package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class diferenciaNotas {
    int[] notas;
    Scanner sc;

    public void pedirNotas(int cantidad) {
	sc = new Scanner(System.in);
	notas = new int[cantidad];
	for (int i = 0; i < notas.length; i++) {
	    System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
	    notas[i] = sc.nextInt();

	}
    }

    /*
     * TODO: Programa este método para que calcule la diferencia entre * la nota mas
     * alta y la mas baja
     */
    public void calcularDiferencia() {
	Arrays.sort(notas);
	System.out.println("La diferencia es: " + (notas[notas.length-1] - notas[0]));
    }

    public static void main(String[] args) {
	diferenciaNotas ejemplo = new diferenciaNotas();
	// Averigua cómo introducir un número en args[0] desde eclipse
	int elementos = Integer.parseInt(args[0]);
	ejemplo.pedirNotas(elementos);
	ejemplo.calcularDiferencia();
    }
}
