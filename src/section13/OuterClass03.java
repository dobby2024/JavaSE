package section13;
/*
 * 인스턴스 내부클래스
 * 	기본적인 일반 내부클래스이다.
 * 	외부클래스 안에 생성되기 때문에 클래스를 사용하려면
 * 	외부클래스 객체가 생성된 상태에서 객체를 생성 할 수 있다.
 * 
 * 인스턴스 내부클래스 선언
 * 	Outer outer = new Outer();
 * 	Outer.Inner inner = outer.new Inner();
 * 
 */

public class OuterClass03 {
	public static void main(String[] args) {
		
		OuterClass03 outer = new OuterClass03();
		OuterClass03.InnerClass inner = outer.new InnerClass();
		inner.info();
		
	}
	
	public class InnerClass {
		public void info() {
			System.out.println("인스턴스내부클래스 안에 일반메서드 입니다.");
		}
	}

}
