package section09;

public class Constructor04 {
	
	static {
		System.out.println("Constructor04() static 초기화 블럭 입니다.");
	}
	
	{
		System.out.println("Constructor04() 초기화 블럭 입니다.");
	}
	
	public Constructor04() {
		System.out.println("Constructor04() 생성자 입니다.");
	}
	
	public static void main(String[] args) {
		Constructor04 con04 = new Constructor04();
		
	}

}
