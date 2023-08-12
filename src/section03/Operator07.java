package section03;
/*
 * 7. 시프트 연산자 
 * 	>>(오른쪽 시프트) : 부호를 유지하면서 지정한 수만큼 오른쪽으로 비트이동시킨다.
 * 	<<(왼쪽 시프트) : 부호비트에 영향을 주지않고 왼쪽으로 비트이동시킨다.
 * 	
 */

public class Operator07 {
	
	public static void main(String[] args) {
		int num = 10;	// 10을 2진수로는 1010
		int leftNum = num << 2;	// 왼쪽으로 2비트 이동 101000
		int rightNum = num >> 1; // 오른쪽으로 1비트 이동 101
		
		System.out.println("Org Num: " + num);
		System.out.println("Left Shift Num by 2 : " + leftNum);
		System.out.println("Right Shift Num by 1 : " + rightNum);
		
		
	}

}



