package section04;
/*
 * 1-3. if ~ else if ~ else
 * 	if(조건식1) {
 * 		조건식1 true일 때 실행 코드영역
 * 	} else if(조건식2) {
 * 		조건식2 true일 때 실행 코드영역
 * 	} else {
 *		조건식1, 조건식2 모두 false일 때 실행 코드영역 
 * 	}
 * 
 * 
 * 
 */
public class Conditional03 {
	public static void main(String[] args) {
		double num = 13.8;
		
		if(num % 3 == 0) {
			System.out.println("num % 3 == 0");
		} else if(num % 3 == 1) {
			System.out.println("num % 3 == 1");
		} else if(num % 3 == 2) {
			System.out.println("num % 3 == 2");
		} else {
			System.out.println("num은 정수가 아닙니다.");
		}
		
		System.out.println("메인메서드 종료");
		
		
		
		
		
	}

}






