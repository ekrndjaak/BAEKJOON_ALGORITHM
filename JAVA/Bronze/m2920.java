package JAVA.Bronze;

import java.util.HashMap;
import java.io.*;
public class m2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[8];
        for(int i = 0; i<8; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        String result = "mixed";
        if (isAscending(num)) {
            result = "ascending";
        } else if (isDescending(num)) {
            result = "descending";
        }

        // 결과 출력
        System.out.println(result);
    }

    // 오름차순인지 확인하는 메서드
    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 내림차순인지 확인하는 메서드
    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}