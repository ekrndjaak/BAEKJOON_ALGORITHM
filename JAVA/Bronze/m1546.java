package JAVA.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class m1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // arr 배열 선언 후 값 대입 
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i<N; i++){
            int score = Integer.parseInt(input[i]);
            arr[i] = score;
        }
        // arr 배열 중 가장 큰값 고르기
        Arrays.sort(arr);
        int max = arr[N-1];

        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        double Avr = (double) sum*100 / (max*N);
        System.out.printf("%.2f\n", Avr);
    }
}
