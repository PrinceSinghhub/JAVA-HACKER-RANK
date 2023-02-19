package hacker_rank_java;

import java.util.Scanner;

public class Java_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = "";
        for(int i = a; i<b; i++) {
            result+=r.charAt(i);

        }
        System.out.println(result);
    }
}
