package JAVA.Bronze;

import java.io.*;

public class m2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[][] a = new int[15][15];

        for(int i = 0; i <= 14; i++){
            a[0][i] = i;
        }

        for(int i = 1; i <= 14; i++){
            for(int j = 1; j <= 14; j++){
                a[i][j] = a[i][j-1] + a [i-1][j];
            }
        }

        for(int i =0; i <T ; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(a[k][n]);
        }
    }
}
