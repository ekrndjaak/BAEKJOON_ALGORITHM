package JAVA.Silver;

import java.util.Scanner;

public class m1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        // 숫자 0 ~ 9를 배열로 만듬
        int [] cnt = new int[10];

        // 해당하는 숫자 카운트 세기
        for(int i = 0; i < num.length(); i++){
            int digit = Character.getNumericValue(num.charAt(i));
            cnt[digit]++;
        }
        // 6 과 9는 서로 뒤집어서 사용 가능
        cnt[6] = (cnt[6] + cnt[9] + 1) / 2;
        cnt[9] = 0;

        // 숫자중에서 가장 많이 등장한 숫자 횟수 판별
        int max = 0;
        for(int i = 0; i < 10; i++){
            max = Math.max(max, cnt[i]);
        }
        System.out.println(max);
    }
}
