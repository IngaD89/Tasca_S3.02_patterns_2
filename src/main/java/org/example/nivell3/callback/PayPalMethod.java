package org.example.nivell3.callback;

import java.util.Scanner;

public class PayPalMethod extends Payment{
    private final Scanner scanner = new Scanner(System.in);
    private String email;



    public PayPalMethod() {
    }

    public PayPalMethod(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PayPalMethod {" +
                "email='" + email + '\'' +
                " } ";
    }

    @Override
    public void execute() {
        System.out.println("Introduce tu correco electronico");
        this.email = scanner.nextLine();

        PayPalMethod paypal = new PayPalMethod(email);

        System.out.println("Se esta haciendo pago con PayPal de usuario " + paypal);
    }
}
