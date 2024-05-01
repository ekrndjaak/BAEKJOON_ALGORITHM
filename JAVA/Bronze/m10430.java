package JAVA.Bronze;

import java.util.Scanner;

public class m10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result1 = (a + b) % c;
        int result2 = ((a%c) + (b%c)) % c;
        int result3 = (a*b) % c;
        int result4 = ((a%c) * (b%c)) %c;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
