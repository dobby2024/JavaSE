package section17;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda05 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 47, 68, 22, 12, 7);

		numbers.stream()
			.filter(e -> e % 2 == 0)
			.map(e -> e * e)	// 각 요소에 연산을 반영한다.
			.forEach(System.out::println);
//			.forEach(e -> System.out.println(e));
		
		
		List<Integer> numbers2 = 
				numbers.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * e)	// 각 요소에 연산을 반영한다.
				.collect(Collectors.toList());	// 변환된 요소 List로 반환
		
		numbers2.stream().forEach(System.out::println);
		
		long count = numbers2.stream().count();
		System.out.println(count);
		
		
		
	}

}




