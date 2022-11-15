import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int a, b, x, y;
        double c, z;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextDouble();
        double value = (b*c+y*z);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", value);


        sc.close();

    }
}

