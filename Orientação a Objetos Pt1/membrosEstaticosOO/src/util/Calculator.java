package util;

public class Calculator {
    public static final double PI = 3.14159;

    public static  double circumference(double radius){
        return 2*PI*radius;
    }
    public static double volume(double radius){
        return PI*Math.pow(radius,3)*4.00/3.00;
    }
}
