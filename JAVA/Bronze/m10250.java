package JAVA.Bronze;

import java.util.Scanner;

public class m10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor = N % H;
            int room = (N/H) +1;

            if(floor == 0){
                floor = H;
                room -= 1;
            }
            System.out.println(floor * 100 + room);
        }
    sc.close();
    }
}
