package section07;
/*
 * OOP (Object Oriented Programming)
 * 	객체지향 프로그래밍
 * 	프로그램을 작성할 때 데이터와 데이터를 조작하는 메서드(함수)를
 * 	하나의 논리적 단위로 묶는 방식 (객체) 
 * 
 * 객체 (Object)
 * 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것.
 * 	정의가능하고 식별 가능한것을 말한다.
 * 
 * 	예) 물리적인 객체 - 컴퓨터, 휴대폰, 모니터, 학생, 대한민국 국민
 * 		추상적인 객체 - 주문, 게임유닛, 영수증
 * 
 * 객체의 구성요소
 * 	1) 속성	-> 변수
 * 	2) 기능	-> 메서드
 * 
 * 	예) 티모 객체
 * 			속성 1) 공격력	- 15
 * 				2) 방어력	- 3
 * 				3) 체력(HP) - 800
 * 				4) 이동속도 - 5
 * 	
 * 			기능	1) 실명	- 상대 시야 가리고 독데미지 + 상대 스킬침묵
 * 				2) 신속 	- 이동속도 올라가는 스킬 { 이동속도 * 1.2; }
 * 
 * class - 붕어빵틀, 와플기계
 * 	객체를 만들기 위한 설계도
 * 	new 연산자를 통해 class에 저장된 코드를 읽어
 * 	인스턴스(객체)화 한다. => 메모리에 저장 또는 로드
 * 		
 * class 구조
 * (접근제한자) class 클래스명 (extends 상속클래스) (implements 인터페이스 상속) { // 클래스 선언부
 * 		
 * 		초기화 => (생성자)	
 * 	
 * 		속성 => 변수(멤버변수, 멤버필드)
 * 		기능 => 메서드(멤버메서드)
 * }
 * 
 * 객체화 - new 연산자로 인스턴스화 가능!
 * 	클래스명(타입) 변수명 = new 클래스();
 * 
 * 
 * 가비지 컬렉터(Garbage Collector)
 * 	자바에서 동적 할당된 메모리(Heap 영역) 중에서 더 이상 사용되지 않는
 * 	객체를 찾아 제거하는 프로세스.
 * 
 * 
 */
public class OOP01 {
	public static void main(String[] args) {
		Car car1 = new Car();	// Car 클래스로 객체 생성
		Car car2 = new Car();
		
		int num1 = 10;
		double num2 = 3.14;
		
		System.out.println("car1 바퀴 개수 : " + car1.wheel);
		System.out.println("car2 바퀴 개수 : " + car2.wheel);
		
		car1.wheel = 3;
		
		System.out.println("car1 바퀴 개수 : " + car1.wheel);
		System.out.println("car2 바퀴 개수 : " + car2.wheel);
		
		car1.drive();	// drive() 메서드 호출
		
	}
}









