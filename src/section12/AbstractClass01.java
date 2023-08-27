package section12;

import section12.access1.Animal;
import section12.access1.Dog;
import section12.access1.Pig;

/*
 * 추상클래스(Abstract Class)
 * 	미완성클래스, 구현되지 않은 추상메서드가 존재하는 클래스
 * 	abstarct 키워드를 사용하여 선언한다.
 * 	직접 객체 생성 불가. 상속 후 추상메서드 오버라이딩해야 사용가능
 * 
 */


public class AbstractClass01 {
	
	public static void main(String[] args) {
		// 추상클래스 객체생성 불가
		// Animal animal = new Animal();
		Pig pig = new Pig();
		pig.cry();
		
		// 다형성
		Animal animal1 = new Pig();
		animal1.cry();
		
		Animal animal2 = new Dog();
		animal2.cry();
		
	}

}







