package section18.access1;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	// 동기화 메서드 - Thread Safe
//	public synchronized int getMoney() {
//		if(totalMoney == 0) {
//			return 0;
//		}
//		
//		totalMoney -= 1;
//		
//		return 1;
//	}
	
	public int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		
		synchronized (this) {
			totalMoney -= 1;
		}
		
		return 1;
	}

}



