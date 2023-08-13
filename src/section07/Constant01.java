package section07;
/*
 * 상수(Constant)
 * 	프로그램내에서 변하지 않는 값을 나타내며
 *  이값은 한번 정해지면 변경할 수 없다.
 *  보통 대문자로 선언한다.
 *  
 *  final 키워드 사용
 * 
 */
public class Constant01 {
	
	static final double PI = 3.141592;
	
	
	public static void main(String[] args) {
		// 원의 반지름
		int r = 10;
		
		// 원의 넓이 구하기
		double area = PI * r * r;
		System.out.println("원의 넓이: " + area);
		
		area = 0; // 0으로 초기화
		
		area = Math.PI * Math.pow(r, 2);
		System.out.println("Math를 이용한 원의 넓이: " + area);
		
	}
}





