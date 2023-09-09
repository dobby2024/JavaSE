package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ***** Map
 * 	Map 인터페이스는 키-값(value) 쌍으로 데이터를 저장하는 자료구조이다.
 * 	키는 중복을 허용하지 않는다. 순서 보장하지 않는다.
 * 	값은 중복 허용한다.
 * 
 */
public class Collection04 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 91);
		map.put("Son", 100);
		
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Alice Score: " + score);
		
		// 특정 키의 존재여부 확인
		if(map.containsKey("Son")) {
			System.out.println("Son Score: " + map.get("Son"));
		}
		
		System.out.println("==================================");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.print("name: " + key);
			System.out.println(", score: " + map.get(key));
		}

		System.out.println("==================================");
		
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.print("name: "+ name);
			System.out.println(", score: " + map.get(name));
		}
		
		
		// map 데이터 길이
		System.out.println("map 길이: " + map.size());
		
		
		// 키 값을 통해 특정 데이터 삭제
		map.remove("Bob");
		
		// 데이터 전체 삭제
		map.clear();
	}

}











