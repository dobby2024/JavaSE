package section15;
/*
 * StringBuffer 클래스 
 * 	문자열을 동적으로 다루기 위한 클래스
 * 	Thread Safe O
 * 
 * StringBuilder 클래스
 * 	문자열을 동적으로 다루기 위한 클래스
 * 	Thread Safe X
 * 
 */
public class JavaLang05 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println("sb: " + System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println("sb: " + System.identityHashCode(sb));
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("안녕하세요. ");
		System.out.println(sb2);
		System.out.println("sb2: " + System.identityHashCode(sb2));
		sb2.append("Hello, JAVA!");
		System.out.println(sb2);
		System.out.println("sb2: " + System.identityHashCode(sb2));
		
	}

}











