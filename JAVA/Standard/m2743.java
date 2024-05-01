package JAVA.Standard;

import java.util.Scanner;

public class m2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int cnt = 0;
        for (int i = 0; i < n.length(); i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
