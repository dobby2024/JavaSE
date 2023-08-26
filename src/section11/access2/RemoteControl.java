package section11.access2;

public class RemoteControl {
	public int volume = 20;
	public int channel = 0;
	
	public void volumeUp() {
		volume += 1;
	}
	
	public void volumeDown() {
		volume -= 1;
	}
	
	public void channelUp() {
		channel +=1;
	}
	
	public void channelDown() {
		channel -=1;
	}
	
	public void getInfo() {
		System.out.println("RemoteControl");
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}

}






