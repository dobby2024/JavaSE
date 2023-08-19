package section07;

public class Var02 {
	public static void main(String[] args) {
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		System.out.println("===card1===");
		card1.getInfo();
		
		System.out.println("===card2===");
		card2.getInfo();
		
		card1.number = "Q";
		
		Card.width = 70;
		
		System.out.println("===card1===");
		card1.getInfo();
		
		System.out.println("===card2===");
		card2.getInfo();
		
		
		
	}
}
