package JAVA.study.hashmap;


import java.util.HashMap;

// HashMap은 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이루어 저장된다.
// HashMap은특정 데이터의 저장 위치를 해시 함수를 통해 바로 알 수 있다. -> 검색이 빠르다
public class StudyHash {
    public static void main(String[] args) {
        // HashMap 생성 방법, 기본 capacity:16, load factor:0.75
        HashMap<String, String> h1 = new HashMap<String, String>();
        HashMap<String, String> h2 = new HashMap<String, String>();

        //HashMap 메서드
        //1. 데이터 추가
        h1.put("aaa", "1111"); // key와 value를 저장
        h1.put("bbb", "2222");
        h1.put("ccc", "3333");
        h2.putAll(h1); // Map h1의 데이터를 h2에 전부 저장
        h1.putIfAbsent("aaa", "0000"); // 기존 데이터에 key가 없으면 key와 value를 저장

        //2. 데이터 삭제
        h1.clear(); // h1의 모든 데이터를 삭제
        h1.remove("bbb"); // key와 일치하는 기존 데이터를 삭제
        h1.remove("aaa","1111"); // key(aaa), value(1111) 삭제 -> key와 value가 동시에 일치하는 데이터 삭제

        // 3. 데이터 수정
        h1.replace("ccc", "4444"); // key(ccc)와 일치하는 기존 데이터 value를 변경
        h1.replace("bbb","2222","2121"); //key와 oldvalue가 동시에일치할때, newvalue로 변경

        // 4. 데이터 확인
        h1.containsKey("ccc"); // Key와 일치하는 데이터가 있는지 여부를 반환(있으면 true)
        h1.containsValue("3333"); // value가 일치하는 데이터가 있는지 여부를 반환(있으면 ture)
        h1.isEmpty(); // 데이터가 빈 상태인지 여부를 반환(빈상태면 true)
        h1.size(); //key-value 맵핑 데이터의 개수를 반환한다.

        // 5. 데이터 반환
        h1.get("ccc"); //key와 맵핑된 value값을 반환
        h1.getOrDefault("ccc","blank"); // ket와 맵핑된 value값을 반환하고있으면 defaultValue값을 반환
//        Set<Map.Entry<K, V>> entrySet( ) : 모든key-value 맵핑 데이터를 가진 Set 데이터를 반환합니다.
//        Set<K>keySet() :모든key 값을 가진 Set 데이터를 반환합니다.
//        Collection<V> values() :모든 value값을 가진 Collection 데이터를 반환합니다.

    }
}
