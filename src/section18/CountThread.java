package section18;

public class CountThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("CountTHread 시작!");
		
		for(int i = 1; i < 11; i++) {
			System.out.print(Thread.currentThread().getName() + "-");
			System.out.println(i*100);
			
			try {
				Thread.sleep(1000);	// 1초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("CountTHread 종료!");
	}
}


