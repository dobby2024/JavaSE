package section11.access1;

public class Bus extends Car {

	public Bus() {
		color = "Green";
		type = "버스";
	}
	
	@Override
	public void drive() {
		System.out.println("승객을 태우고 운전을 합니다.");
	}
	
	public void clickBell() {
		System.out.println("하차전 벨을 누릅니다.");
	}
	
}





