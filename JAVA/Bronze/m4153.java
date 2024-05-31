package JAVA.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int[] arr = new int[3];
            String[] input = br.readLine().split(" ");
            for(int i = 0; i<input.length; i++){
                arr[i] = Integer.parseInt(input[i]);
            }

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }
            int a = arr[0] * arr[0];
            int b = arr[1] * arr[1];
            int c = arr[2] * arr[2];
            if(c == a + b){
                System.out.println("right");
            } else{
                System.out.println("worng");
            }

        }
    }
}