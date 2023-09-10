package section17;

import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		
		List<String> names = List.of("Apple", "Bat", "Cat", "Dog");
		
//		printBasicWithFiltering(names);
		printWithFpFiltering(names);
		
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String element : list) {
			if(element.endsWith("at")) {
				System.out.println(element);
			}
		}
	}
	
	private static void printWithFpFiltering(List<String> list) {
		list.stream()
			.filter(e -> e.endsWith("at"))
			.forEach(e -> System.out.println(e));
	}
	
	
}




