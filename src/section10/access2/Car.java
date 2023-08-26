package section10.access2;

public class Car {
	// Car 객체 속성정의
	public String model;
	protected String color;
	int year;
	private String brand;
	
	public void getInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("brand: " + brand);
	}

}
