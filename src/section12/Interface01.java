package section12;
/*
 * 인터페이스(interface)
 * 	추상화된 타입을 정의하는데 사용되는 개념
 * 	추상메서드와 static 상수로만 이루어져 있다.
 * 	다중 상속이 가능하다.
 * 	implements 키워드로 상속한다.
 * 
 * 	객체의 구조(뼈대)를 설계하는 역할을 한다. 
 * 
 */

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

public class Interface01 {
	
	public static void main(String[] args) {
		
		System.out.println(Cat.PAW);
		
		PersianCat pCat = new PersianCat();
		pCat.eat();
		
		// Cat.PAW = 2; // 상수라서 변경불가
		
		// 인터페이스도 다형성이 된다.
		Cat hCat = new HouseCat();
		hCat.hunt();
		
		HouseCat hCat2 = (HouseCat) hCat;
		hCat2.play();
		
		// 다형성으로 변수 타입변환
		Playable hCat3 = hCat2;
		hCat3.play();
		
	}

}






