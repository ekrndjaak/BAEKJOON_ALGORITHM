package JAVA.Bronze;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class m1152_ex {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        System.out.println(st.countTokens());

        StringTokenizer ST = new StringTokenizer(S, " ");
        System.out.println(ST.countTokens());
    }
}
