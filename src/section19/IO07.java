package section19;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream
 * 	출력을 다루기위한 클래스.
 * 	콘솔/파일데이터를 쓸 때 사용된다.
 * 
 */
public class IO07 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream("./upload2/hello4.txt");
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
			System.out.println("파일에 출력하기!");
			
			ps.println();
			ps.println("=============================");
			ps.println("PrintStream 출력 테스트 중 ...");
			ps.println("프린트스트림으로 작성했어요!");
			ps.println("=============================");
			
			for(int i = 0; i < 7; i++) {
				for(int j = 0; j < i+1; j++) {
					ps.print("*");
				}
				ps.println();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) ps.close();
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}








