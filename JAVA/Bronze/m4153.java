package JAVA.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class m4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}