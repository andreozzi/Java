import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a, b, c;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangle = (a*c)/2;
        double circle = Math.pow(c,2)*pi;
        double ezio = ((a+b)*c)/2;
        double square = Math.pow(b,2);
        double rectangle = a*b;
        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPÉZIO: %.3f%n",ezio);
        System.out.printf("QUADRADO: %.3f%n",square);
        System.out.printf("RETANGULO: %.3f%n",rectangle);


        sc.close();

    }
}
