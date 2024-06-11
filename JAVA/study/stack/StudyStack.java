package JAVA.study.stack;

import java.util.Stack;

public class StudyStack {
    public static void main(String[] args) {
        // stack의 종류(int, string, boolean)
        Stack<Integer> stackint = new Stack<>();
        Stack<String> stackstr = new Stack<>();
        Stack<Boolean> stackbool = new Stack<>();
        // stack 클래스 매소드

        // 1. push -> 데이터를 스택에 추가하고, 해당 값을 반환한다.
        stackint.push(1);
        stackint.push(2);
        stackint.push(3);

        // 2. peek() -> 스택이 마지막 요소를 반환한다. 즉 스택에서 가장 먼저 사용될 요소를 반환한다.
        System.out.println(stackint.peek());

        // 3. pop() -> 스택의 마지막 요소를 제거함과 동시에 해당 값을 반환한다.
        stackint.pop();
        System.out.println(stackint);
        stackint.pop();
        System.out.println(stackint);
        stackint.pop();
        System.out.println(stackint);

        // 4. empty() -> 스택이 비어있는지 여부를 반환한다.
        System.out.println(stackint.empty());

        // 5. search() -> 메서드의 이자를 스택에서 검색하여 해당 위치를반환
        stackint.push(1);
        stackint.push(2);
        stackint.push(3);
        System.out.println(stackint.search(2));
        System.out.println(stackint.search(1));

    }
}
