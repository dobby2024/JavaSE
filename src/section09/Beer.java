package section09;

public class Beer {
	// 속성
	int volume;
	String brand;
	String type;
	int price;
	
	public Beer(int volume, String brand, String  type, int price) {
		this.volume = volume;
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	
	public void getInfo() {
		System.out.println("volume: " + volume);
		System.out.println("brand: " + brand);
		System.out.println("type: " + type);
		System.out.println("price: " + price);
	}

}



