package section03;
/*
 * 5. 대입 연산자
 * 	변수에 값을 할당하는데 사용되는 연산자 입니다.
 * 	= (등호) 
 *  복합대입연산자
 *  +=, -=, *=, /=, %= 
 * 
 */
public class Operator05 {

	public static void main(String[] args) {
		// = 대입연산저로 변수 num에 10 할당
		int num = 10;
		
		num += 10;	// num = num + 10; 같다
		System.out.println("num: " + num);
		
		num -= 5;	// num = num - 5;
		System.out.println("num: " + num);
		
	}

}




