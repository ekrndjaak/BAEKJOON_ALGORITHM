package JAVA.Bronze;

import java.io.*;
public class m3052_ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[42];
        for(int i = 0; i < 10 ; i++){
            int num = Integer.parseInt(br.readLine());
            int r = num%42;
            a[r]++;
        }
        int cnt = 0;
        for(int i =0; i < 42; i++) {
            if (a[i] > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
