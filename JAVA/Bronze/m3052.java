package JAVA.Bronze;

import java.util.*;
public class m3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[42];
        for(int i = 0; i < 10 ; i++){
            int num = sc.nextInt();
            int r = num%42;
            a[r]++;
        }
        int cnt = 0;
        for(int i =0; i < 42; i++) {
            if (a[i] > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
