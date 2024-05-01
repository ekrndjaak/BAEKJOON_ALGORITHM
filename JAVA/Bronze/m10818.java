package JAVA.Bronze;

import java.util.Scanner;

public class m10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        for(int i = 0; i < T; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < T; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(min +" "+ max);
    }
}
