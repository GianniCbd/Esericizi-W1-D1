package it.be.epicode.esercizio2;

import it.be.epicode.esercizio2.exceptions.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Inserire km percorsi");
            String kmP = scanner.next();

            System.out.println("Inserire carburante consumato in Litri");
            String LtC = scanner.next();

            try {
                double kmPDouble = Double.parseDouble(kmP);
                double LtCDouble = Double.parseDouble(LtC);

                if (kmPDouble < 0 || LtCDouble < 0) {
                    throw new exceptions.ValoriErrati("Inserire numeri interi");
                }
                double kmL = kmPDouble / LtCDouble;
                System.out.println("I km/l percorsi sono: " + kmL);
            } catch (NumberFormatException e) {
                throw new exceptions.ValoriErrati("Inserire numeri interi");
            }

            System.out.println("Vuoi calcolare di nuovo? (si/no)");
            String risposta = scanner.next();

            if (!risposta.equalsIgnoreCase("si")) {
                break;
            }
        }
    }
}