package hacker_rank_java;

import java.util.Scanner;

public class java_sunstring_in_gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int st = sc.nextInt();
        int e = sc.nextInt();
        String res =mystring(s,st,e);
        System.out.println(res);
    }

    static String mystring(String s, int st, int e) {
        String res = "";
        for (int i = st; i<=e; i++) {
            res+=s.charAt(i);
        }
        return res;
    }
}
