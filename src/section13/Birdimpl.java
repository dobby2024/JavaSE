package section13;

public class Birdimpl implements Bird {
	
	private String name = "앵무새";
	
	@Override
	public void sing() {
		System.out.println("노래를 해요~");
	}
	
	@Override
	public void fly() {
		System.out.println("하늘을 날아요~");
	}
	
	public String getName() {
		return name;
	}
}
