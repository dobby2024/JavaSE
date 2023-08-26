package section11;
/*
 * 다형성(Polymorphism)
 * 	같은 인터페이스 또는 부모클래스를 공유하는 객체가
 * 	여러 유형의 타입을 가질 수 있는 기능을 말한다.
 * 
 */

import section11.access1.Bus;
import section11.access1.Car;

public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.clickBell();
		System.out.println("========================");
		
		Car car = new Bus();
		car.drive();
		// car.clickBell();	// 문법상오류 컴파일러가 컴파일 에러발생
		
		System.out.println("========================");
		// 부모타입에서 자식타입으로 대입시 형변환필수!
		Bus bus2 = (Bus) car;
		bus2.drive();
		bus2.clickBell();
		
	}

}














