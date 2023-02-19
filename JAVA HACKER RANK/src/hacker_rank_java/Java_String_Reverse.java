package hacker_rank_java;

import java.util.Scanner;

public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        String result = "";
        int len = r.length();
        for(int i = len-1; i >=0; i--) {
            result+=r.charAt(i);

        }
        if(r.equals(result)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
