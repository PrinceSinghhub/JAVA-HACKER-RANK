package hacker_rank_java;
import java.util.Scanner;
public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String arr[] = new String[3];


        for (int i = 0; i < 3; i++) {
            String s = str.nextLine();
            arr[i] = s;
        }
        System.out.println("================================");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            String string = arr[i];
            int sl = string.length();

            for(int j = 0; j<sl;j++){
                if(string.charAt(j) == ' '){
                    System.out.print("\t\t"+"0");
                }
                else {
                    System.out.print(string.charAt(j));
                }

            }

            System.out.println();
        }

        System.out.println("================================");
    }
}


