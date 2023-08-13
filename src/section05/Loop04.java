package section05;
/*
 * 중첩 반복문
 * 	반복문 안에 반복문
 * 
 * 
 */
public class Loop04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();	// 개행
			
		}
	}
}



