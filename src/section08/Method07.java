package section08;

public class Method07 {
	public static void main(String[] args) {
		
		int result = add(24, 55, 77);
		System.out.println("result: " + result);
	}
	
	// 7. 인자 O, 리턴 O -> 인자값을 받아 연산 후 반환값을 준다.
	public static int add(int a, int b) {
		return a + b;		
	}
	
	// 오버로딩 메서드
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	

}
