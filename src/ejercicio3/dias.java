package ejercicio3;

import java.util.Scanner;

public class dias {

    public static void casoDePrueba(Scanner in) {

	int DaysMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	int day = in.nextInt();

	int month = in.nextInt() - 1;

	int total = 0;
	int aux = 0;

	for (int i = month; i < DaysMonth.length; i++) {

	    aux += DaysMonth[i];
	    total = day;
	    total = aux - total;

	}

	System.out.println(total);
	System.out.println();
    }

    public static void main(String args[]) {
	Scanner in = new Scanner(System.in);

	int numCasos = Integer.parseInt(in.nextLine());
	for (int i = 0; i < numCasos; i++) {
	    casoDePrueba(in);
	}
    }
}
