package section11;

import section11.access1.Car;

public class Polymorphism04 {
	
	public static void main(String[] args) {
		/*
		 *  기본형 변수
		 *  8가지 - boolean, char, byte, short, int, long, float, double
		 */
		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
		
		/*
		 * 참조형 변수 -> 객체
		 *  
		 * 객체
		 * 	1) 속성
		 * 	2) 기능
		 * 
		 */
		Car car1 = new Car();
		System.out.println(car1);
		
		car1.color = "RED";
		System.out.println(car1.color);
		
		
		
	}

}
