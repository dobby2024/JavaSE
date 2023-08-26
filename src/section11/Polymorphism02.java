package section11;

import section11.access2.RemoteControl;
import section11.access2.SmartRemoteControl;

public class Polymorphism02 {
	public static void main(String[] args) {
		SmartRemoteControl smartRC = new SmartRemoteControl();
		smartRC.volumeUp();
		smartRC.volumeDown();
		smartRC.channelUp();
		smartRC.channelDown();
		smartRC.getInfo();
		smartRC.doInternet();
		
		System.out.println("========================================");
		
		// 다형성이용하여 객체생성
		RemoteControl remoteC = new SmartRemoteControl();
		remoteC.volumeUp();
		remoteC.channelUp();
		remoteC.getInfo();
		// remoteC.doInternet(); RemoteControl타입에 없는 메서드 컴파일에러
		
		SmartRemoteControl smartRC2 = (SmartRemoteControl) remoteC;
		smartRC2.doInternet();
		
	}

}






