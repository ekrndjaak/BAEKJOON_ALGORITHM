package JAVA.Bronze;

import java.io.*;
import java.util.Scanner;

public class m2577 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] num_count = new int[10];

        for(int i = 0; i<10;i++){
            num_count[i] = 0;
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a * b * c;

        String num = Integer.toString(total);
        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            num_count[digit]++;
        }
        for(int i = 0; i <10; i++){
            System.out.println(num_count[i]);
        }
    }
}
