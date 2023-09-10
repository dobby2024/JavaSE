package section18;
/*
 * 
 * 스레드(Thread)
 * 	스레드는 프로그램내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 * 
 */
public class Thread01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");
		
		new MyThread().start();
		
		System.out.println("메인 스레드 종료!");
	}

}







