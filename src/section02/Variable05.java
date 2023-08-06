package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 * 	정수표현
 * 		컴퓨터는 2진수로 표현(bit)
 * 		부호비트(Most Significant Bit) + 수치비트
 * 		음의 값을 표현할 때 2의보수 표현
 * 
 *  실수표현 (부동소수표현)
 *  	지수부(e)비트 + 가수부(m)비트
 *  실수표현 수식
 *  	±(1.m)*2^(e±127) 
 *  부동소수점오차
 *  	컴퓨터가 정확한 실수표현 불가능 근사치 값 표현으로 인해 생긴 오차
 * 
 */

public class Variable05 {
	public static void main(String[] args) {
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		
		// for 반복문
		for(int i = 0; i < 100; i++) { // 0, 1, 2, ... 99
			f += 0.1f;	// f = f + 0.1f;
			d += 0.1;
			bd = bd.add(new BigDecimal(0.1));
		}
		
		// 0.1 * 100 = 10
		System.out.println("f의 값: " + f);
		System.out.println("d의 값: " + d);
		System.out.println("bd의 값: " + bd);
		
	}
}





