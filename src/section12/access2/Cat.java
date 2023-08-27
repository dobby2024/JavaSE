package section12.access2;

public interface Cat {
	
	// 인터페이스에서 static final 생략가능
	public static final int PAW = 4;	// static 상수
	
	// 추상메서드로만 구성되어있다. abstract 생략가능
	public abstract void eat();
	
	// abstract 생략해도 추상메서드 이다.
	public void sleep();
	
	public void hunt();
	
}





