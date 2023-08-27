package section11;

import section11.access3.Ade;
import section11.access3.Coffee;
import section11.access3.Drink;

public class Polymorphism07 {
	public static void main(String[] args) {
		
		Drink drink1 = new Ade(); 
		Drink drink2 = new Coffee();
		
		System.out.println(drink1 instanceof Ade);
		System.out.println(drink1 instanceof Coffee);
		
		System.out.println(drink2 instanceof Ade);
		System.out.println(drink2 instanceof Coffee);
		
	}
}






