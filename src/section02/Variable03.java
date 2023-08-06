package section02;
/*
 * 3. 정수형
 * 	byte	(1byte) : -128 ~ +127
 * 	short	(2byte) : -32,768 ~ +32,767
 * 	int		(4byte) : -2,147,483,648 ~ +2,147,483,647
 * 	long	(8byte) : -9,223,372,036,854,775,808 
 * 						~ +9,223,372,036,854,775,807
 */
public class Variable03 {
	public static void main(String[] args) {
		// 정수형 변수 선언과 동시에 값 대입하기
		byte iByte = 10;
		short iShort = 100;
		int iInt = 10000;
		long iLong = 10000000;
		
		System.out.println("byte형: " + iByte);
		System.out.println("short형: " + iShort);
		System.out.println("int형: " + iInt);
		System.out.println("long형: " + iLong);
		
		iByte += 120;	// iByte = iByte + 120;
		System.out.println("byte overflow: " + iByte);
		
	}

}






