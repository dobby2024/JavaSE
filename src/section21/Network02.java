package section21;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL (Uniform Resource Locator)
 * 	인터넷에서 웹 페이지, 이미지, 동영상 등과 같은 리소스를 찾을 수 있는 주소
 * 
 * https:// n.news.naver.com:443/article/215/0001125423?ntype=RANKING
 * 
 * 프로토콜(protocol)
 * 	컴퓨터 네트워크를 통해 통신을 수행하기 위한 표준 규칙, 절차, 혹은 통신 프로세스를 의미
 * 	ex) http/https - 웹서버 프로토콜 
 * 		ftp - 파일서버 프로토콜
 * 		mailto - 전자메일 서버 프로토콜
 * 		telnet - 원격접속 프로토콜
 * 
 * 호스트(host)
 * 	리소스가 위치한 서버의 이름
 * 	ex)n.news.naver.com 
 * 
 * 포트(port)
 * 	서버에서 사용하는 서비스나 응용프로그램에 할당된 번호
 * 	ex) 80(http default) 443(https default)
 * 
 * 경로(path)
 * 	웹 서버에서 자원에 대한 경로(물리/추상 경로)
 * 	ex) /article/215/0001125423
 * 
 * 쿼리(query) - 파라미터
 * 	추가로 서버에 보내는 데이터 (물음표 뒤)
 *  ex) ntype=RANKING
 * 
 * 
 */
public class Network02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://n.news.naver.com:443/article/215/0001125423?ntype=RANKING");
		
		System.out.println("porotocol: " + url.getProtocol());
		System.out.println("host: " + url.getHost());
		System.out.println("port: " + url.getPort());
		System.out.println("path: " + url.getPath());
		System.out.println("query: " + url.getQuery());
		
	}
}







