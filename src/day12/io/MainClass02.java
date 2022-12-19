package day12.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
 * FileInputStream
 * 		- 파일을 읽는 객체  
 * 
 * FileOutputStream
 * 		- 파일에 쓰는 객체
 * 
 */

public class MainClass02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			
			File f4 = new File("./upload2");
			// 하위 디렉토리를 생성하면 true, 생성하지 못하면 false
			f4.mkdirs();
			
			File f5 = new File(f4, "hello2.txt");
			f5.createNewFile();
			
			// hello2.txt에 쓰기위한 객체
			// FileOutputStream 디렉토리 경로는 존재해야한다.
			// 파일은 없으면 자동으로 생성된다.
			fos = new FileOutputStream(f5);
			
			int readByteCnt = 0;
			byte[] b = new byte[100];
			
			int i =1;
			
			// fis.read(b) => b 길이만큼 읽어서 b에 저장
			// 읽은 길이값 readByteCnt에 저장			
			while((readByteCnt = fis.read(b)) != -1) {
				// fos.write() => b 데이터 readByteCnt 길이만큼 쓰기
				fos.write(b, 0, readByteCnt);
				System.out.println(i+ " : " + new String(b, 0, readByteCnt));
				i++;
			}
			
			
			
			System.out.println("실행 완료!");
		} catch(IOException e) {
			System.out.println("IOException 발생!");
		} finally {
			if(fos != null)fos.close();
			if(fis != null)fis.close();
		}
	}
}







