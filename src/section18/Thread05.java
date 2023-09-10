package section18;

public class Thread05 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");

		new Thread(() -> {
			System.out.println("익명 클래스 스레드 시작!");
			try {
				Thread.sleep(2000); // 2초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("익명 클래스 스레드 종료!");
			
		}).start();

		System.out.println("메인 스레드 종료!");
	}

}
