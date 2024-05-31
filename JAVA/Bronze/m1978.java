package JAVA.Bronze;

import java.io.*;

public class m1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 수의 개수 N을 입력받기
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 두 번째 줄에서 N개의 수를 입력받기
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);

            // 소수 판별
            if (num > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    cnt++;
                }
            }
        }

        // 결과 출력
        System.out.println(cnt);
    }
}