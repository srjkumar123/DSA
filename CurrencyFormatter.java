import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;

public class CurrencyFormatter {
    public static String currency(Locale locale, double payment){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String number = formatter.format(payment);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale = new Locale("en", "IN");


        // Write your code here.

        System.out.println("US: " + currency(Locale.US, payment));
        System.out.println("India: " + currency(indiaLocale, payment));
        System.out.println("China: " + currency(Locale.CHINA, payment));
        System.out.println("France: " + currency(Locale.FRANCE, payment));
    }
}