package JAVA.Bronze;

import java.util.Scanner;

public class m3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kk, qq, ll, bb, nn ,pp;

        int k = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();

        int ck = 1;
        int cq = 1;
        int cl = 2;
        int cb = 2;
        int cn = 2;
        int cp = 8;

        kk = ck - k;
        qq = cq - q;
        ll = cl - l;
        bb = cb - b;
        nn = cn - n;
        pp = cp - p;

        System.out.println(kk+" "+qq+" "+ll+" "+bb+" "+nn+" "+pp);
    }
}
