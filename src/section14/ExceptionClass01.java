package section14;
/*
 * 예외(Exceiption)
 * 	자바프로그램 구동 중에 나타나는 오류를 말한다.
 * 	문법적으로 문제 없어 보이지만 실제 운영 중에 생기는 문제들
 * 
 * try ~ catch 예외처리 방법
 * 
 * try {
 * 	 	정상실행 코드
 * } catch(익셉션클래스 매개변수명) {
 * 	 	해당 예외가 발생했을 경우 실행할 코드
 * }
 * 
 */
public class ExceptionClass01 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		int result = 0;
		/*
		if(num2 == 0) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		} else {
			result = num1 / num2;
			
			System.out.println("result: " + result);
		}
		*/
		
		try {
			result = num1 / num2;
			
			System.out.println("result: " + result);
			
		} catch(Exception e) { // Exception e = new ArithmeticException(); 예외정보 객체화
			e.printStackTrace();	// 에러로그는 파일로 남긴다.
			
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");	// App 화면에 출력
			
		}
		
	}

}











