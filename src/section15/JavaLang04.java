package section15;

public class JavaLang04 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2) {
			System.out.println("str1 == str2 true");
		} else {
			System.out.println("str1 == str2 false");
		}
		
		if(str1 == str3) {
			System.out.println("str1 == str3 true");
		} else {
			System.out.println("str1 == str3 false");
		}
		
		str1 = null;
		
		// String 에서 값 비교 equals() 메서드 사용해야한다.
		if(str1 !=null && str1.equals(str3)) {
			System.out.println("str1.equals(str3) true");
		} else {
			System.out.println("str1.equals(str3) false");
		}
		
	}

}


