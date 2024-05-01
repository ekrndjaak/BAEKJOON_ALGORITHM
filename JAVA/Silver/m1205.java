package JAVA.Silver;

import java.util.*;
public class m1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T_score = sc.nextInt();
        int P = sc.nextInt();

        Integer[] arr = new Integer[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder()); //정렬

        if(N == P && T_score <= arr[arr.length-1]){
            System.out.println(-1);
        }else{
            int rank = 1;
            for(int i = 0; i<arr.length; i++){
                if(T_score < arr[i]){
                    rank++;
                }else{
                    break;
                }
            }
            System.out.println(rank);
        }
    }
}