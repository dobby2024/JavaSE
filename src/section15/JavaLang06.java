package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 	기본 자료형을 객체로 감싸서 사용할 수 있도록 해주는 클래스
 * 	기본자료형 래퍼클래스 8가지
 * 		- Boolean, Character, Byte, Short, Integer, Long, Float, Double  
 * 
 */
public class JavaLang06 {
	public static void main(String[] args) {
		// 문자열 "12345"를 정수형 int로 변환
		String strNum = "12345";
		int num = Integer.parseInt(strNum);
		
		System.out.println("num: " + num);
		
		// 기본형처럼 대입 가능
		Integer num2 = 10;
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는것을 권장
		Integer num3 = new Integer(10);
		Integer num4 = Integer.valueOf(10);
		
		int num5 = num4;	// 오토박싱(자동변환) JDK 1.5
		
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("num2: " + System.identityHashCode(num2));
		System.out.println("num3: " + System.identityHashCode(num3));
		System.out.println("num4: " + System.identityHashCode(num4));
		
		// 실수형 타입 선언
		Double dNum = Double.valueOf(3.141592);
		
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
		
		
	}

}




