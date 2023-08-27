package section13;

public class OuterClass02 {
	public static void main(String[] args) {
		new OuterClass02.InnerClass().info();
		
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
		inner.info();
	}
	
	static class InnerClass {
		public void info() {
			System.out.println("정적내부클래스의 동적일반메서드 입니다.");
		}
	}
}
