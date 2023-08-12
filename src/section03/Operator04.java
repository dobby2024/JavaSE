package section03;
/*
 * 4. 논리 연산자
 * 	&& : AND 조건, 교집합 개념, 두 항 모두 true 일때 true 
 * 	|| : OR 조건, 합집합 개념, 두 항중 하나이상 true 일때 true
 * 	!  : NOT 조건, 여집합 개념, 논리(boolean)값 반전 시킨다.
 */
public class Operator04 {
	
	public static void main(String[] args) {
		boolean result = true && true;
		System.out.println("result: " + result);
		
		boolean result2 = false || true;
		System.out.println("result2: " + result2);
		
		boolean result3 = true;
		System.out.println("!result3: " + !result3);
		
		
		String order = "의류";
		
		if (order == "식품" || order == "전기전자" || order == "의류") {
			System.out.println("20% 할인 행사 중입니다.");
		} else {
			System.out.println("할인 미적용 상품입니다.");
		}
		
	}
}







