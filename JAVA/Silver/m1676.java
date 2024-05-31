package JAVA.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int zerocnt = count(N);
        System.out.println(zerocnt);
//        int cnt = 0;
//        int sum = 1;
    }

    public static int count(int n) {
        int cnt = 0;
        for (int i = 5; i <= n; i *= 5) {
            cnt += n / i;
        }
        return cnt;
    }
//        for(int i = N; i > 0; i--){
//        sum = sum * i;
//    }
//                String str = Integer.toString(sum);
//                for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == '0'){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
}