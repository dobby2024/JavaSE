package section19;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class IO09 {
	public static void main(String[] args) {
		
		String filePath = "./upload/member.obj";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);
			
			MemberVO member = (MemberVO) ois.readObject();
			System.out.println("MemberVO 객체 백업파일 -> 객체화 완료!");
			
			System.out.println(member.getName());
			System.out.println(member.getAge());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {}
			
		}
		
		
	}
}





