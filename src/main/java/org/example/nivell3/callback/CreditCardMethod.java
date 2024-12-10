package org.example.nivell3.callback;

import java.util.Scanner;

public class CreditCardMethod extends Payment{
    private final Scanner scanner = new Scanner(System.in);

    private String ownerName;
    private String cardNumber;
    private int expirationMonth;
    private int expirationYear;
    private int ccv;

    public CreditCardMethod() {
    }

    public CreditCardMethod(
            String ownerName,
            String cardNumber,
            int expirationMonth,
            int expirationYear,
            int ccv
    ) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.ccv = ccv;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    @Override
    public String toString() {
        return "CreditCard {" +
                "ownerName='" + ownerName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", expirationMonth=" + expirationMonth +
                ", expirationYear=" + expirationYear +
                ", ccv=" + ccv +
                " } ";
    }

    @Override
    public void execute() {

        System.out.println("Introduce nombre completo de titular");
        this.ownerName = scanner.nextLine();
        System.out.println("Introduce numero de targeta de titular");
        this.cardNumber = scanner.nextLine();
        System.out.println("Introduce mes (numerico) de caducidad de la targeta");
        this.expirationMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce año (numerico) de caducidad de la targeta");
        this.expirationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce ccv(numerico) de tu targeta");
        this.ccv = scanner.nextInt();
        scanner.nextLine();

        CreditCardMethod credit = new CreditCardMethod(ownerName, cardNumber, expirationMonth, expirationYear, ccv);

        System.out.println("Se esta haciendo un pago con tarjeta de credito " + credit);
    }
}
