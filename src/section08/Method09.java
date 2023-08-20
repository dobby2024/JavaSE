package section08;

public class Method09 {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 98};
		
		for(int value : values) {
			System.out.println(value);
		}
		
		System.out.println("=====================");
		
		refTest(values);
		
		for(int value : values) {
			System.out.println(value);
		}
	}
	
	public static void refTest(int[] values) {
		values[2] = 100;
	}
}



