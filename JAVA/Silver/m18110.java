package JAVA.Silver;

import java.io.*;
import java.util.Arrays;

public class m18110 {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);

        int cutline = (int) Math.round(N*0.15);;

        int sum=0;
        int count=0;
        for(int i = cutline; i < N - cutline; i++) {
            sum += scores[i];
            count++;
        }
        int result = Math.round((float)sum/count);
        System.out.println(result);
    }
}
