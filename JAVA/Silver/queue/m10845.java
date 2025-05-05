package JAVA.Silver.queue;

import java.io.*;
import java.util.*;

public class m10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int lastnum = -1;

        for(int i = 0; i < N; i++){
                String c = br.readLine();

                if(c.startsWith("push")){
                    String[] part = c.split(" ");
                    int num = Integer.parseInt(part[1]);
                    q.offer(num);
                    lastnum = num;
                } else if(c.startsWith("pop")){
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                } else if(c.startsWith("size")){
                    sb.append(q.size()).append("\n");
                } else if(c.startsWith("empty")){
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                } else if (c.equals("front")) {
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                } else if (c.equals("back")) {
                    sb.append(q.isEmpty() ? -1 : lastnum).append("\n");
                }
        }
        System.out.println(sb.toString());
    }
}
