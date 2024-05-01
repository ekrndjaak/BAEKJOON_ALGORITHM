package JAVA.Bronze;

import java.util.Scanner;

public class m2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int cnt = 1;
        for(int i = 0; i <9; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<9; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                break;
            }
            cnt++;
        }
        System.out.println(max);
        System.out.println(cnt);
    }
}