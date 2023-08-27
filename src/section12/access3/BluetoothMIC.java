package section12.access3;

// 인터페이스 끼리 상속 extends 키워드 사용, 다중상속 가능
public interface BluetoothMIC extends Microphone, Speaker {
	
	public abstract void connect();

}
