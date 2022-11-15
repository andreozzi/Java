import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int hora = sc.nextInt();
        double valor = sc.nextDouble();
        double salary = (double) hora*valor;
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f%n", salary);


        sc.close();
    }
}
