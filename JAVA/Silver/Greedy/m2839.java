package JAVA.Silver.Greedy;

import java.io.*;

public class m2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(N>= 0){
            if(N%5 == 0){
                cnt += N/5;
                System.out.println(cnt);
                return;
            }
            N -= 3;
            cnt++;
        }
        System.out.println("-1");
    }
}