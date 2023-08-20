package section10;

import section10.access1.Bicycle;
import section10.access1.MountainBike;

/*
 * 상속(Inheritance)
 * 	부모 클래스(상위클래스, 슈퍼클래스)와 자식클래스(하위클래스)가 있으며
 * 	자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버(변수, 메서드) 사용이 가능하다.
 * 
 * 상속 방법
 * 	class 자식클래스명 extends 부모클래스명
 * 
 * 패키지(Package)
 * 	관련된 클래스, 인터페이스 등 그룹화 하는데 사용되는 디렉토리
 * 	
 * 	이름충돌 방지: 같은이름 클래스, 인터페이스 페키지를 달리하여 충돌방지
 * 	코드 구조화 : 관련된 클래스를 패키지 단위로 그룹화
 * 	접근 제어 : 클래스나 멤버에 접근제한자를 적용하여, 
 * 			해당패키지 외부에서 접근 제한 가능
 * 
 * super 키워드
 * 	부모객체를 참조하는 키워드
 * 
 * ***** 오버라이딩(Overriding)
 * 	상속받은 메서드를 하위클래스에서 재정의하는것을 말한다.
 * 	
 * 어노테이션 
 * 	자바 프로그래밍에서 메타데이터를 나타내며
 * 	클래스, 메서드, 변수등의 선어부의 적용할수 있다.
 * 
 * 	예) @Override - 메서드가 상위클래스에서 오버라이딩되었음을 나타낸다.
 * 
 * 
 */
public class Inheritance01 {
	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle();
		
		bicycle1.handleType = "라이저바";
		bicycle1.gear = 7;
		bicycle1.wheel = 2;
		
		bicycle1.getInfo();
		
		System.out.println("=======================");
		
		MountainBike mBike = new MountainBike();
		mBike.handleType = "BMX 핸들바";
		mBike.gear = 30;
		mBike.wheel = 2;
		mBike.isSuspension = true;
		
		mBike.getInfo();
		
	}

}




