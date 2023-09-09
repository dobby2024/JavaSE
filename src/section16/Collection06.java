package section16;

import java.util.ArrayList;
import java.util.List;

public class Collection06 {
	public static void main(String[] args) {
		
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		
		member1.setId(1);
		member1.setName("홍길동");
		member1.setMobile("01011111111");
		member1.setAddr("서울특별시");
		
		member2.setId(2);
		member2.setName("짱구");
		member2.setMobile("01022222222");
		member2.setAddr("떡잎마을");
		
		memberList.add(member1);
		memberList.add(member2);
		
		System.out.println("no\tname\tmobile\t\taddr");
		for(MemberVO member : memberList) {
			int id = member.getId();
			String name = member.getName();
			String mobile = member.getMobile();
			String addr = member.getAddr();
			
			System.out.println(id + "\t" + name + "\t" + mobile +"\t" + addr);
		}
		
	}

}
