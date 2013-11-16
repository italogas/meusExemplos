package exemplos.Gerais;

public class DeckOfCardsTest {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.embaralha();
		
		for(int i = 0; i < 13; i++){
			System.out.printf("%-20s%-20s%-20s%-20s\n", deck.getCard(), deck.getCard(), deck.getCard(), deck.getCard());
			
		}
	}

}
