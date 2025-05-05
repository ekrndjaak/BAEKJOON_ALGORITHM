package JAVA.study.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Method {
    public static void main(String[] args) {
    /*
        큐 선언
        Queue<자료형> 변수명 = new LinkedList<>();
            -> 자료형에 넣은 자료형만 삽입, 삭제 가능

        Queue 변수명 = new LinkedList();
            -> 어떤 자료형이든 삽입, 삭제 가능(이전에 int형을 넣었어도 String형삽입 가능)

         메서드
         Queue<자료형> q = new LinkedList<>();

         */
    Queue<String> q = new LinkedList<>();

    /* 삽입 */
        q.add("a");     // 변환값 삽입 성공 시 true, 실패시 Exception 발생
        q.offer("a");   // 변환값 삽입 성공시 true, 실패시 false 반환

    /* 삭제 */
        q.remove();         //반환값 삭제, 공백이면 큐 Exception 발생
        q.remove("a");   //반환값 큐에 해당 value가 존재하면 삭제 후 true, 존재하지 않으면 false
        q.poll();           // 반환값 삭제된 value, 공백이면 null 반환

    /* 큐의 front에 위치한 value 반환*/
        q.element();    // 반환값 큐 head에 위치한 value, 공백 큐면 Exception 발생
        q.peek();       // 반환값 큐 head에 위치한 value. 공백 큐면 null 반환

    /* 큐 초기화 (=공백 큐 만들기) */
        q.clear();      // 반환값 x

    /* 큐 크기 */
        q.size();       // 반환값 큐 사이즈 반환

    /* 큐에 해당 원소 존재하는지 */
        q.contains("찾을 value"); // 반환값 해당 값이 존재할 때 true, 해당 값이 없을때 false

    /* 공백 큐인지 확인하기 */
        q.isEmpty();    //반환값 공백큐면 true, 아니면 false
    }
}
