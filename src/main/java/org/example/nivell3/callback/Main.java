package org.example.nivell3.callback;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do{

        System.out.println("""
                0. salir de programa
                1. PayPal
                2. Targeta de credito
                3. Targeta de debito
                """);
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 0 -> System.out.println("Hasta pronto");
            case 1 -> {
                Payment paypal = new PayPalMethod();
                paypal.executeWith(() -> System.out.println("Se ha terminado proceso de pago con PayPal"));
            }
            case 2 -> {
                Payment creditCard = new CreditCardMethod();
                creditCard.executeWith(() -> System.out.println("Se ha terminado proceso de pago con targeta de credito"));
            }
            case 3 -> {
                Payment debitCard = new BankDebitMethod();
                debitCard.executeWith(() -> System.out.println("Se ha terminado proceso de pago con targeta de debito"));
            }
            default -> System.out.println("Escoge una opción válida");
        }

        } while (option != 0);
    }
}
