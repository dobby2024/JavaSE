package section18;

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		CountThread ct = new CountThread();
		ct.setName("CountThread");
		ct.start();
		
		for(int i = 1; i < 11; i++) {
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i);
			
			try {
				Thread.sleep(500);	// 0.5초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 스레드 종료!");
	}

}
