package section13;

public class OuterClass06 {
	public static void main(String[] args) {
		
		String name = new Bird() {
			
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
		}.getName();
		
		System.out.println("name: " + name);
		
		
		// 일반 클래스랑 비교하기
		String name2 = new Birdimpl().getName();
		System.out.println("name2: " + name2);
		
	}
}







