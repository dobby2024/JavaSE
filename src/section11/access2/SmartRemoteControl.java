package section11.access2;

public class SmartRemoteControl extends RemoteControl{
	
	public void doInternet() {
		System.out.println("인터넷을 해요~");
	}
	
	@Override
	public void getInfo() {
		System.out.println("SmartRemoteControl");
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}

}
