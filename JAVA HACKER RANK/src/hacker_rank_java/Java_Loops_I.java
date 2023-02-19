package hacker_rank_java;
import java.util.Scanner;
public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n+" x "+ i +" = "+ i*n);
        }
    }
}
