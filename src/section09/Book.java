package section09;

public class Book {
	String title;
	int price;
	int totalPage;
	String author;
	
	// 생성자 - 객체 생성시 실행
	// this - 자가자신 참조 키워드	
	public Book() {
		// 멤버 초기화
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "김영우";
	}
	
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
	}
	
	

}
