package section11.access2;

public class AIRemoteControl extends SmartRemoteControl{
	
	public void voiceBtn() {
		System.out.println("음성인식 기능이 있어요~");
	}
	
	@Override
	public void getInfo() {
		System.out.println("AIRemoteControl");
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}
}
