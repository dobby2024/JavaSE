package section07;

public class Card {
	
	// 정적(static)변수
	public static int width = 62;
	public static int height = 88;
	
	public String type = "Spade";
	public String number = "A";
	
	
	public void getInfo() {
		System.out.println("width: " + width);
		System.out.println("height: " + height);
		System.out.println("type: " + type);
		System.out.println("number: " + number);
	}

}
