package JAVA.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
public class m10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            arr[i][0] = input[0];
            arr[i][1] = input[1];
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {

                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });
        for(int i = 0; i < N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
