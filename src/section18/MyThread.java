package section18;

public class MyThread extends Thread {
	
	@Override
	public void run() {	// 스레드의 메인메서드 역할
		System.out.println("MyThread 시작!");
		
		try {
			Thread.sleep(2000);	// 2초 일시정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread 종료!");
	}
}
