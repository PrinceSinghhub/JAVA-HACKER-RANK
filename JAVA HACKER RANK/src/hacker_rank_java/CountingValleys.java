package hacker_rank_java;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int step = input.nextInt();
        input.nextLine();
        String comm = input.nextLine();


        int ans = countValley(step,comm);
        System.out.println(ans);
    }

    static int countValley(int step, String comm) {

        int valley = 0;
        int ans = 0;
        for(int i = 0;i<comm.length();i++){
            if(comm.charAt(i)=='D'){
                valley-=1;
            }
            else if(comm.charAt(i) == 'U'){
                valley+=1;
                if(valley == 0){
                    ans+=1;
                }
            }
        }
        return ans;
    }
}
