package section15;

public class JavaLang07 {
	
	public static void main(String[] args) {
		
		Integer num1 = 10;
		Integer num2 = 10000;
		
		/*
		 * compareTo()
		 * ex) num1.compareTo(num2);
		 *  결과가 양수이면 num1 > num2
		 *  결과가 음수이면 num1 < num2
		 *  결과가 0이면 두 수는 같다.
		 */
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2 보다 크다.");
		} else if (num1.compareTo(num2) == 0) {
			System.out.println("num1과 num2는 같다.");
		} else {
			System.out.println("num1은 num2 보다 작다.");
		}
		
		// 문자열 숫자를 정수형으로 변환
		String strNum = "9999";
		Integer num3 = Integer.parseInt(strNum);
		
		// 숫자를 문자열로 변환
		String strNum2 = num3.toString();
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE);
		System.out.println("INT MIN: " + Integer.MIN_VALUE);
		
		// 최대값 최소값 비교
		int maxValue = Integer.max(num1, num2);
		int minValue = Integer.min(num1, num2);
		 
		System.out.println("최대값: " + maxValue);
		System.out.println("최소값: " + minValue);
		
		System.out.println("문자 여부: " + Character.isLetter('A'));
		System.out.println("숫자 여부: " + Character.isDigit('5'));
		System.out.println("공백 여부: " + Character.isWhitespace(' '));
		
	}
}








