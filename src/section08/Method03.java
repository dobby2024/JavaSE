package section08;

public class Method03 {
	public static void main(String[] args) {
		printMember("025", "피카츄", 28);
	}
	
	// 3. 인자 O (여러매개변수) 리턴 X -> 여러 인자값 받아 실행하고 끝나는 메서드
	public static void printMember(String id, String name, int age) {
		System.out.println("ID: " + id);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

}
