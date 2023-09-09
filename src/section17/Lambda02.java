package section17;

import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 * 	컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등 효율적이고 간결하게 수행 가능.
 * 
 * 
 */
public class Lambda02 {
	public static void main(String[] args) {
		
		List<String> names = List.of("Apple", "Bat", "Cat", "Dog");
		
//		printBasic(names);
		printWithFP(names);
	}
	
	private static void printBasic(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream()
			.forEach(e -> System.out.println("e - " + e));
	}

}






