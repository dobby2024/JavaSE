package section12.access1;

public abstract class Animal {
	
	public void eat() {
		System.out.println("밥을 먹어요~");
	}
	// 추상메서드 - 자식클래스에서 구현
	public abstract void cry();

}
