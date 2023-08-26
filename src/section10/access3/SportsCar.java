package section10.access3;

import section10.access2.Car;

public class SportsCar extends Car {
	public boolean isOpen;
	
	@Override
	public void getInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);	// 상속관계 접근 가능
		// System.out.println("year: " + year); // 같은 패키지만 가능
		// System.out.println("brand: " + brand); // 같은 클래스내에서만 가능
		System.out.println("isOpen: " + isOpen);
	}

}
