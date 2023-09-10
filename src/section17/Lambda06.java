package section17;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer e) {
		return e % 2 ==0;
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer e) {
		return e * e;
	}
	
}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer e) {
		System.out.println(e);
	}
	
}


public class Lambda06 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 45, 7, 3, 19, 14, 72, 32);
		
		numbers.stream()
				.filter(new EvenNumberPredicate())
				.map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());
		
		
	}

}
