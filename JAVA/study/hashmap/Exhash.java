package JAVA.study.hashmap;

import java.util.HashMap;

public class Exhash {
    public static void main(String[] args) {
        HashMap<String,String> h1 = new HashMap<String, String>();
        HashMap<String,String> h2 = new HashMap<String, String>();

        h1.put("aaa", "1111");
        h1.put("bbb", "2222");
        h1.put("ccc", "3333");
        h2.putAll(h1);
        System.out.println("h1: " + h1);
        System.out.println("h2: " + h2);

        System.out.println("[1]: " + h1.containsKey("aaa")); // key가 일치하면 true
        System.out.println("[2]: " + h1.containsValue("1111")); // value가 일치하면 true
        System.out.println("[3]: " + h1.isEmpty());// h1이 비어있다면 true, 비어있지 않으면 false
        System.out.println("[4]: " + h1.size()); // h1의 맵핑 갯수를 반환
        System.out.println("[5]: " + h1);
        System.out.println("[6]: " + h1.remove("aaa","1111")); // h1의 key가 aaa, value가 1111 일치하면 제거
        System.out.println(h1);
        System.out.println("[7]: " + h1.put("bbb", "0000")); // h1에 key가 bbb, value가 0000 추가
        System.out.println("[8]: " + h1.replace("ccc", "3131")); // h1의 Key가 ccc인것의 value를 3131로 변경
        System.out.println("[9]: " + h1);
    }
}
