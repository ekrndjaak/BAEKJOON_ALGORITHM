package JAVA.Silver.Greedy;

import java.util.Scanner;
import java.util.*;

public class m11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> times = new ArrayList<>();
        int sum = 0;
        int tmp = 0;

        int T = sc.nextInt();
        for(int i = 0; i< T; i++){
            int time = sc.nextInt();
            times.add(time);
        }
        Collections.sort(times);
        for(int i = 0; i < T; i++){
            tmp = tmp + times.get(i);
            sum += tmp;
        }
        System.out.println(sum);
    }
}
