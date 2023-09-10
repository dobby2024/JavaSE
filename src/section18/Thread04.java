package section18;

public class Thread04 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		InterThread interThread = new InterThread();
		Thread thread = new Thread(interThread);
		
		thread.start();
		
		
		System.out.println("메인 스레드 종료!");
	}

}
