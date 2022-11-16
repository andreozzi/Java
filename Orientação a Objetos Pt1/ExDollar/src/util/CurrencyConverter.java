package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double dollarReal(double quantity, double dollarprice){
       return dollarprice*quantity*(1.0+IOF);
    }

}
