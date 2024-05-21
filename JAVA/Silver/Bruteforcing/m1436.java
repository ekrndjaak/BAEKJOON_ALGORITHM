package JAVA.Silver.Bruteforcing;

import java.util.Scanner;

public class m1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int y = 665;

        while(count < N){
            y++;
            if(Integer.toString(y).contains("666")){
                count++;
            }
        }
        System.out.println(y);
    }
}
