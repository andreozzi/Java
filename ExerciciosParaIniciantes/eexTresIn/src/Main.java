import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int dif = (a*b - c*d);
        System.out.println("DIFERENÇA = "+dif);


        sc.close();
    }

}
