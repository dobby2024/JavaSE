package section11.access3;

public class Drink {
	public String name;			// 이름
	public String volume;		// 용량
	public String type;			// 종류
	public int price;			// 가격
	public double discountRate;	// 할인율
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("volume: " + volume);
		System.out.println("type: " + type);
		System.out.println("price: " + price);
		System.out.println("discountRate: " + discountRate);
	}
	
	public void getDiscountInfo() {
		if(discountRate == 0.333) {
			System.out.println("2+1 할인 행사중 입니다.");
		} else if (discountRate == 0.5) {
			System.out.println("1+1 할인 행사중 입니다.");
		} else {
			System.out.println("행사 상품이 아닙니다.");
		}
	}
	
	

}
