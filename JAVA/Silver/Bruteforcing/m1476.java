package JAVA.Silver.Bruteforcing;

import java.util.Scanner;
public class m1476 {
    public static int convertYear(int E, int S, int M) {
        int year = 1;
        while (true) {
            if ((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) {
                return year;
            }
            year++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(convertYear(E, S, M));
        scanner.close();
    }
}
