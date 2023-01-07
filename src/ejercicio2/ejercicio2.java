package ejercicio2;

import java.util.Arrays;

public class ejercicio2 {

    public static void main(String[] args) {
	int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
	int inicial = 0;

	for (int i = 0; i < numeros.length - 5; i++) {
	    
	    for (int j = 0; j < numeros.length - 1; j++) {
		inicial = numeros[j + 1];
		numeros[j + 1] = numeros[0];
		numeros[0] = inicial;
	    }

	}
	System.out.println(Arrays.toString(numeros));
    }
}
