package section21.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 소켓(Socket)
 * 	자바에서 양방향 통신을 위한 객체이다.
 * 	java.net 다루고 있다. 
 * 
 */
public class EchoServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket s = null;
		InputStream in = null;
		OutputStream out = null;
		
		try {
			// 3000번 port로 Serversocket 객체 생성
			serverSocket = new ServerSocket(3000);
			
			System.out.println("클라이언트 요청 대기중 ...");
			
			s = serverSocket.accept();
			
			System.out.println("클라이언트 요청 수락 ...");
			
			// Client에서 보낸 메시지 읽기
			in = s.getInputStream();
			byte[] b = new byte[1024];
			int readByteCnt = in.read(b);
			System.out.println(new String(b, 0, readByteCnt));
			
			
			// Client Socket에 쓰기 (msg 보내기)
			out = s.getOutputStream();
			out.write(b, 0, readByteCnt);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null) out.close();
				if(in != null) in.close();
				if(s != null) s.close();
				if(serverSocket != null) serverSocket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}











