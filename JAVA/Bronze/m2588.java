package JAVA.Bronze;

import java.util.Scanner;

public class m2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = num1 * num2;

        int digit1 = num1 * (num2 % 10); // 일의 자리
        int digit2 = (num1 * ((num2 % 100)- num2 % 10)) / 10; //십의 자리
        int digit3 = num1 *(num2 / 100); //세 번째 자리

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(result);
    }
}
