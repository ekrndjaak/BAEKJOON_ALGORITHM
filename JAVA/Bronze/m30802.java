package JAVA.Bronze;

import java.io.*;

public class m30802 {
    public static void main(String[] args) throws IndexOutOfBoundsException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] size = br.readLine().split(" ");
        int[] arr1 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr1[i] = Integer.parseInt(size[i]);
        }

        String[] tp = br.readLine().split(" ");
        int T = Integer.parseInt(tp[0]);
        int P = Integer.parseInt(tp[1]);

        int totalT = 0;
        for (int i = 0; i < 6; i++) {
            totalT += (arr1[i] + T - 1)/T;
        }

        int maxP = N / P;
        int remainP = N % P;

        System.out.println(totalT);
        System.out.println(maxP + " " + remainP);

    }
}
