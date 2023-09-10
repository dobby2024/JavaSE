package section19;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IO03 {
	public static void main(String[] args) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		
		String yearMonthDay = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		String time = now.format(formatter);
		
		String path = "./upload/" + yearMonthDay;
		String fileName = "upload_" + time;
		
		File directory = new File(path);
		
		// mkdirs() - 하위 디렉토리까지 생성
		if(directory.mkdirs()) {
			System.out.println(directory.getParent() + " 디렉토리가 생성되었습니다.");
		}
		
		File file = new File(directory, fileName);
		if(file.createNewFile()) {
			System.out.println(fileName + "이 생성되었습니다.");
		}
		
	}
}
