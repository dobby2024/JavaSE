package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream / OutputStream
 * 	바이트 기반 입력과 출력을 다루는 추상 클래스이다.
 * 
 * 파일 I/O Stream
 *	FileInputStream
 *		파일을 바이트 단위로 순차적으로 읽는 객체
 *
 * 	FileOutputStream
 * 		파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 * 
 */
public class IO04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// ./upload/hello.txt 파일을 읽을 수 있는 객체 생성
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 폴더가 생성되었습니다.");
			}
			
			// ./upload2/hello2.txt 파일에 쓰기 준비하는 객체 생성
			// 파일이 존재하지 않으면 자동으로 생성해준다. (폴더생성 X)
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}
			
			System.out.println("파일 복사 완료!");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}










