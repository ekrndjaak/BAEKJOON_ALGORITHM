package JAVA.Bronze;

import java.io.*;

public class m2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);

        int days = (int)Math.ceil((double)(V - A)/(A - B)) + 1;

        System.out.println(days);

    }
}
