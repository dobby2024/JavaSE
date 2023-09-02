package section15;

import section15.access1.SoccerTeam;

/*
 * 1. 얕은복사(Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사
 * 	- 동일한 객체를 참조하게 된다.
 * 
 * 2. 깊은복사(Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	- 새로운(다른) 객체를 참조하게 된다.
 * 
 */
public class JavaLang02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		SoccerTeam sTeam1 = new SoccerTeam("토트넘", "런던", 1882, "프리미어리그");
		SoccerTeam sTeam2 = sTeam1;
		
		SoccerTeam sTeam3 = (SoccerTeam) sTeam1.callClone();
		
		if(sTeam1.equals(sTeam2)) {
			System.out.println("sTeam1 과 sTeam2는 같다.");
		} else {
			System.out.println("sTeam1 과 sTeam2는 다르다.");
		}
		
		if(sTeam1.equals(sTeam3)) {
			System.out.println("sTeam1 과 sTeam3은 같다.");
		} else {
			System.out.println("sTeam1 과 sTeam3은 다르다.");
		}
		
		System.out.println(System.identityHashCode(sTeam1));
		System.out.println(System.identityHashCode(sTeam2));
		System.out.println(System.identityHashCode(sTeam3));
		
		System.out.println(sTeam1);
		System.out.println(sTeam2);
		System.out.println(sTeam3);
		
	}
}






