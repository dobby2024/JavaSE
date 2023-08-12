package section04;
/*
 * 제어문
 * 	프로그램 실행 흐름을 제어하기 위해 사용되는 구문
 * 
 * 조건문
 * 	주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * 1. if문
 *  if(조건식) {
 *  	조건식이 true 일 때 실행되는 코드영역
 *  }
 *  
 *	if(조건식)
 *		조건식이 true 일 때 실행명령문 (명령문 한줄(;) 중괄호 생략가능) 	
 * 
 */

public class Conditional01 {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다.");
		}
		
		if(num % 2 != 0) {
			System.out.println("num은 홀수 입니다.");
		}
		
		if(num % 2 == 0) 
			System.out.println("num은 짝수 입니다.");
		
		if(num % 2 != 0) 
			System.out.println("num은 홀수 입니다.");
		
	}
}





