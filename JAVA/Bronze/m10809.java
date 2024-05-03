package JAVA.Bronze;

import java.util.Scanner;

public class m10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] fa = new int[26];

        for(int i = 0; i < 26; i++){
            fa[i]= -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (fa[c - 'a'] == -1) {
                fa[c - 'a'] = i;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(fa[i] + " ");
        }
        sc.close();
    }
}
