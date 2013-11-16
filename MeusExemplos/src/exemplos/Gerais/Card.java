package exemplos.Gerais;

public class Card {
	
	private String face; // face da carta, ás
	private String suit; // naipe da carta, espadas

	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	
	public String toString(){
		return face + " de " + suit;
		
	}

}
