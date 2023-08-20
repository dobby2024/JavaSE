package section08;

public class Method05 {
	public static void main(String[] args) {
		
		String[] pokemons = {"피카츄", "라이츄", "파이리","꼬부기"};
		printPokemon(pokemons);
		
	}
	
	// 5. 인자 O - 배열타입, 리턴 X
	public static void printPokemon(String... pokemons) {
		for(String pokemon : pokemons) {
			System.out.println(pokemon);
		}

//		for(int i = 0; i < pokemons.length; i++) {
//			String pokemon = pokemons[i];
//			System.out.println(pokemon);
//		}
		
	}

}
