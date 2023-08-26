package section10;
/*
 * final 클래스
 * 	클래스 키워드 앞에 final 키워드 추가할 경우
 * 	클래스 상속의 마지막임을 뜻한다. 상속불가클래스
 * 
 * 
 * final 메서드
 * 	메서드에서 final 선언하면 해당 메서드는 하위클래스에서 오버라이딩할 수 없다.
 * 	오버라이딩 불가 메서드
 * 
 */


import section10.access4.Jindo;
import section10.access4.PersianCat;

public class Inheritance03 {
	public static void main(String[] args) {
		PersianCat pCat = new PersianCat();
		pCat.walk();
		
		// Cat final 클래스 상속받지 못해 접근불가
//		pCat.eat();
//		pCat.meow();
		
		Jindo jindo = new Jindo(); 
		jindo.bark();
		
		
	}

}






