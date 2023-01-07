package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class puzle {

    public static boolean casoDePrueba(Scanner in) {

	boolean continuar = true;
	int cantidad = in.nextInt();

	if (cantidad == 0)
	    continuar = false;
	else {
	    int[] puzzle = new int[cantidad - 1];
	    for (int i = 0; i < puzzle.length; i++) {
		puzzle[i] = in.nextInt();
	    }

	    Arrays.sort(puzzle);
	    // proceso
	    int pieza = 0;
	    int aux = 0;
	    for (int i = 0; i < puzzle.length; i++) {

		aux++;

		if (puzzle[i] != aux) {
		    pieza = aux;
		    aux++;

		}

	    }
	    System.out.println(" hoglld ");
	    System.out.println(pieza);
	}

	return continuar;

    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (casoDePrueba(in))
	    ;
    }

}