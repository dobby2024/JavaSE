package section21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * URLConnection 클래스
 * 	네트워크 연결을 관리하고 원격 서버와 통신하기 위한 클래스
 * 
 * 
 */
public class Network03 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://n.news.naver.com:443/article/215/0001125423?ntype=RANKING");
		
		URLConnection urlConn = url.openConnection();
		
//		Map<String, List<String>> headMap = urlConn.getHeaderFields();
//		
//		Set<String> set = headMap.keySet();
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			List<String> list = headMap.get(key);
//			System.out.print(key+": ");
//			for(String value: list) {
//				System.out.print(value);
//			}
//			System.out.println();
//		}
//		
//		 // 헤더 필드 출력
//        for (Map.Entry<String, List<String>> entry : headMap.entrySet()) {
//            String key = entry.getKey();
//            List<String> values = entry.getValue();
//            System.out.print(key + ": ");
//            for (String value : values) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
		
		// getInputStream() 메소두는 URLConnection 에서 입력스트림으로 데이터를 읽어온다.
		InputStream in = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
        String readLine = null;
        while((readLine = br.readLine()) != null) {
        	System.out.println(readLine);
        }
        
        br.close();
        isr.close();
        in.close();
		
	}
}
