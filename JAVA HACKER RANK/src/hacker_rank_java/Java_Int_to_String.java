package hacker_rank_java;

import java.util.Scanner;

public class Java_Int_to_String {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        String s = Integer.toString(n);
        if(n>=-100 && n<=100){
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            }
            else {
                System.out.println("Wrong answer.");
            }
        }


    }
}
