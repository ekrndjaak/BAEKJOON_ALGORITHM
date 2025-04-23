package JAVA.Silver.queue;

import java.io.*;
import java.util.*;

public class m1966_ {
    static class Document {
        int index;
        int priority;

        Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 궁금한 문서 위치

            st = new StringTokenizer(br.readLine());
            Queue<Document> queue = new LinkedList<>();
            List<Integer> priorityList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new Document(i, priority));
                priorityList.add(priority);
            }

            // 중요도를 내림차순으로 정렬
            Collections.sort(priorityList, Collections.reverseOrder());

            int printOrder = 0;
            int priorityIndex = 0;

            while (!queue.isEmpty()) {
                Document current = queue.poll();

                if (current.priority == priorityList.get(priorityIndex)) {
                    printOrder++;
                    priorityIndex++;

                    if (current.index == M) {
                        sb.append(printOrder).append("\n");
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }

        System.out.print(sb);
    }
}
