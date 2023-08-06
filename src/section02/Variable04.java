package section02;
/*
 * 4. 실수형
 *	float	(4byte)	: 소수점 7자리 표현
 *	double  (8byte)	: 소수점 15자리 표현
 *
 */
public class Variable04 {
	public static void main(String[] args) {
		float iFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.1;	// double형 d생략 가능
		
		System.out.println("float 형: " + iFloat);
		System.out.println("double 형: " + iDouble);
		System.out.println("double 형: " + iDouble2);
	}

}
