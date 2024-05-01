package JAVA.Standard;

import java.util.Scanner;

public class m10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 & b==0){
                break;
            }
            sum = a + b;
            System.out.println(sum);
            sum = 0;
        }
        sc.close();
    }
}