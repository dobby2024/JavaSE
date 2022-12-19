package day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileReader - 문자파일을 읽을 수 있는 기능 제공
 * 	
 * FileWriter - 문자를 파일에 쓸 수 있는 기능 제공
 * 
 * 
 */

public class MainClass04 {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null; 
		
		try {
			fr = new FileReader("./upload/hello.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("./upload/hello3.txt");
			bw = new BufferedWriter(fw);
					
			int readCharCnt = 0;
			char[] c = new char[2];
			
			int i = 1;
			
			while((readCharCnt = br.read(c)) != -1) {
				bw.write(c, 0, readCharCnt);
				System.out.println(i+ " : " + new String(c, 0, readCharCnt));
				i++;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(bw != null)bw.close();
			if(br != null)br.close();
			if(fw != null)fw.close();
			if(fr != null)fr.close();
		}
		
		System.out.println("실행 완료!");
	}

}










