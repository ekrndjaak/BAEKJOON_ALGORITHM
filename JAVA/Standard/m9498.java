package JAVA.Standard;

import java.util.Scanner;

public class m9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(90<=a && a<=100){
            System.out.println("A");
        }if(80<=a && a<=89){
            System.out.println("B");
        }if(70<=a && a<=79){
            System.out.println("C");
        }if(60<=a && a<=69){
            System.out.println("D");
        }if(0<=a && a<=59){
            System.out.println("F");
        }

    }
}
