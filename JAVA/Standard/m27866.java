package JAVA.Standard;

import java.util.Scanner;

public class m27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        char nthChar = s.charAt(k-1);
        System.out.println(nthChar);

    }
}
