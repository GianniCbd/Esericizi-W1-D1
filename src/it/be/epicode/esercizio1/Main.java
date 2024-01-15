package it.be.epicode.esercizio1;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Array: " + Arrays.toString(array));

        int pos;
        do {
            System.out.println("Scegli la posizione in cui inserire il numero, premi 0 per terminare");
            pos = scanner.nextInt();
        } while (pos < 0);

        int numero;
        do {
            System.out.println("Scegli il numero");
            numero = scanner.nextInt();
        } while (numero < 0);

        try {
            array[pos] = numero;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Non puoi andare oltre la posizione 4");
        }

        System.out.println("Nuovo Array: " + Arrays.toString(array));
    }
}
