package section09;

public class TV {
	
	double size;	// 화면크기
	String resolution;	// 해상도
	int year;
	String brand;
	
	
	public TV() {	// default 생성자
		this.size = 80;
		this.resolution = "UHD(4K)";
		this.year = 2023;
		this.brand = "삼성";
	}
	
	// 생성자 오버로딩
	public TV(double size, String resolution, int year, String brand) {
		this.size = size;
		this.resolution = resolution;
		this.year = year;
		this.brand = brand;
	}
	
	public TV(String... options) {
		this(); // 자기자신 생성자 호출
		getInfo();
		System.out.println("추가 옵션 목록");
		for(String option : options) {
			System.out.println("option: " + option);
		}
	}
	
	
	public void getInfo() {
		System.out.println("size: " + size);
		System.out.println("resolution: " + resolution);
		System.out.println("year: " + year);
		System.out.println("brand: " + brand);
	}

}









