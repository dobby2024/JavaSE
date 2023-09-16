package section21;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * java.net 패키지
 * 	자바에서 네트워크 관련 작업을 수행하는데 사용되는 클래스와 인터페이스를 포함하는 패키지
 * 
 * InetAddress 클래스 
 * 	IP를 관리하는 클래스
 * 
 */
public class Network01 {
	public static void main(String[] args) throws UnknownHostException {
		// InetAddress 객체 생성
		InetAddress ia = InetAddress.getLocalHost();
		
		// getHostName()는 호스트 이름을 반환
		System.out.println("Host Name: " + ia.getHostName());
		
		// getHostAddress()는 호스트 IP를 반환
		System.out.println("IP: " + ia.getHostAddress());
		
		// getByName()는 특정사이트의 IP를 InetAddress객체 반환
		ia = InetAddress.getByName("www.naver.com");
		
		System.out.println("Host Name: " + ia.getHostName());
		System.out.println("Host IP: " + ia.getHostAddress());
		
		
		
	}

}





