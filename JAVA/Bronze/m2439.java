package JAVA.Bronze;

import java.util.Scanner;

public class m2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n-1; j>i;j--){
                System.out.print(" ");
            }
            for(int a = 0; a <= i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
