package ejercicio5;

import java.util.Scanner;

public class picos {

    public static boolean casoDePrueba(Scanner in) {
	boolean continuar = true;
	int cantidad = in.nextInt();

	if (cantidad == 0)
	    continuar = false;
	else {
	    int[] alturas = new int[cantidad];

	    for (int i = 0; i < alturas.length; i++) {
		alturas[i] = in.nextInt();
	    }

	    int picos = 0;
	    // proceso
	    for (int i = 1; i < alturas.length - 1; i++) {

		if (alturas[i] > alturas[i - 1] && alturas[i] > alturas[i + 1]) {
		    picos++;
		    
		}else if (alturas[i - 1] > alturas[i] && alturas[i + 1] > alturas[i]) {
		    picos++;
		}

	    }
	    System.out.println(picos);

	}

	return continuar;

    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (casoDePrueba(in))
	    ;
    }

}
