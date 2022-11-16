package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarprice = sc.nextDouble();

        System.out.println("How many dollar will be bought?");
        double dollarquantity = sc.nextDouble();

        System.out.printf("Amount to be paid on Reais: %.2f%n", CurrencyConverter.dollarReal(dollarquantity, dollarprice));
        
        sc.close();
    }
}
