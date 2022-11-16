package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        Product product = new Product();
        product.name = sc.nextLine();
        product.price = sc.nextDouble();
        product.quantity = sc.nextInt();
        System.out.println("Nome: "+product.name);
        System.out.printf("Price: %.2f%n", product.price);
        System.out.println("Quantity in stock: "+product.quantity);
        System.out.println("Product Data: "+product.toString());
        System.out.println("Enter the number of products to be added in stock: ");

        System.out.println();
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Updated Data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        System.out.println();
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Updated Data: "+product);






        sc.close();
    }
}
