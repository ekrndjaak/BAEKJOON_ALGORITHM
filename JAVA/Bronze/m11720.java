package JAVA.Bronze;

import java.util.Scanner;

public class m11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String n = sc.next();
        String[] arr = n.split("");
        int sum = 0;
        for(int i = 0; i < n.length();i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
