package JAVA;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tmp = 0;
        tmp = a % 5;
        System.out.println(tmp);
    }
}
