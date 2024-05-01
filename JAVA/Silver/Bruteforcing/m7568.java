package JAVA.Silver.Bruteforcing;

import java.util.Scanner;

public class m7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {

            a[i][0] = sc.nextInt(); // 몸무게

            a[i][1] = sc.nextInt(); // 키

            b[i] = 1;

        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (a[i][0] < a[j][0] && a[i][1] < a[j][1]) {

                    b[i]++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(b[i] + " ");
        }
    }
}
