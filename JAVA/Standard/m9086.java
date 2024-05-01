package JAVA.Standard;

import java.util.Scanner;

public class m9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0; i < T ; i++){
            String word = sc.next();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length() -1));
        }
    }
}
