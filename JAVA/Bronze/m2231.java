package JAVA.Bronze;

import java.io.*;

public class m2231 {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int start = Math.max(1, N - 9 * String.valueOf(N).length());
        int result = 0;

        for(int M = start; M < N; M++) {
            int sum = M + sum(M);
            if (sum == N) {
                result = M;
                break;
            }
        }
        System.out.println(result);
    }
    public static int sum(int M){
        int sum = 0;
        while (M>0){
            sum += M%10;
            M/=10;
        }
        return sum;
    }
}
