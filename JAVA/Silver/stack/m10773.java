package JAVA.Silver.stack;

import java.util.*;
import java.io.*;


public class m10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(num);
            }
        }
        for(int val : stack){
            sum += val;
        }
        System.out.println(sum);

    }
}
