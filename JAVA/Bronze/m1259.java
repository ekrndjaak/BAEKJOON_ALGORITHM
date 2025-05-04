package JAVA.Bronze;

import java.io.*;

public class m1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            if(s.equals("0")) break;

            String revers = new StringBuffer(s).reverse().toString();

            if(s.equals(revers)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
