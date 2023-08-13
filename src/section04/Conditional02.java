package section04;
/*
 * 1-2 if ~ else문
 * 	if(조건식) {
 * 		조건식 true일 때 실행되는 코드영역
 * 	} else {
 * 		조건식 false일 때 실행되는 코드영역
 * 	}
 * 
 * 마찬가지로 하나의 명령문일때 중괄호 생략가능!
 * 
 * if(조건식)
 * 		조건식 true일 때 실행명령문;
 * else 
 * 		조건식 false일 때 실행명령문;
 * 
 * 
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num = 13;
		
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		} else {
			System.out.println("num은 홀수 입니다.");
		}
		
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		else
			System.out.println("num은 홀수 입니다.");
		
		
	}
}









