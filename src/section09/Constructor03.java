package section09;

public class Constructor03 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.getInfo();
		
		System.out.println("=========================");
		
		TV tv2 = new TV(27, "FULL HD", 2023, "LG");
		
		tv2.getInfo();
		
		System.out.println("=========================");
		
		String[] options = {"벽걸이", "스마트리모컨", "인터넷결합상품신청(할인)"};
		
		TV tv3 = new TV(options);
		
		
	}
}




