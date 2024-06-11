package JAVA.study.String;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String str = "Hello world!";
        // 띄어쓰기 기준으로 문자열 분리
        StringTokenizer st = new StringTokenizer(str);

        // 구분자를 기준으로 문자열을 분리
        StringTokenizer st1 = new StringTokenizer(str, " ");

        // 구분자를 기준으로 문자열을 분리할 때 구분자도 토큰으로 넣는다. true
        // 구분자를 분리된 문자열 토큰에 포함시키지 않는다. false
        // 디폴트값은 false

        StringTokenizer st2 = new StringTokenizer(str, " ",false);
    }
}
