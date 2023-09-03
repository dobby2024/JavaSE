package section15;

import java.util.Random;

/*
 * 자바 유틸 패키지(java.util)
 * 	자바에서 유용한 유틸클래스, 인터페이스 포함하는 패키지
 * 
 * Random 클래스
 * 	난수 생성해주는 클래스
 * 
 */
public class JavaUtil01 {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 0 ~ 99 사이 정수중 난수 반환
		int ranNum = random.nextInt(100);
		System.out.println("난수: "+ ranNum);
		
		// 0 이상 1미만 난수 반환
		double ranNum2 = random.nextDouble();
		if(ranNum2 < 0.5) {	// 50% 확률
			System.out.println("강화에 성공하였습니다.");
		} else {
			System.out.println("강화에 실패하였습니다.");
		}
		
	}
}








