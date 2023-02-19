package hacker_rank_java;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale INDIA = new Locale("en", "IN");

        double payment = sc.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        int l = india.length();
        String res = "";
        String ico = "Rs.";
        for(int i = 1; i <l; i++) {
            res+=india.charAt(i);
        }
        res = ico+res;
        System.out.println("US: " + us);
        System.out.println("India: "  + res);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}
