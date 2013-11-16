package exemplos.Gerais;

import java.util.Random;

public class DeckOfCards {
	
	private Card[] deck;
	private int cardAtual;
	private final int NUMERODECARTAS = 52;
	private Random randomNumbers;

	public DeckOfCards() {
		String[] face = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez",
				"Valete", "Dama", "Rei"};
		String[] naipe = {"Paus", "Ouros", "Copas", "Espadas"};
		
		deck = new Card[NUMERODECARTAS];
		randomNumbers = new Random();
		cardAtual = 0;
		
		for(int i = 0; i < deck.length; i++){
			deck[i] = new Card(face[i % 13], naipe[i / 13]);
		}
		
	}
	
	public void embaralha(){
		cardAtual = 0;
		
		for(int first = 0; first < deck.length; first++){
			int second = randomNumbers.nextInt(NUMERODECARTAS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
			
	}
	
	public Card getCard(){
		if(cardAtual < deck.length)
			return deck[cardAtual++];
		 else 
			return null;
		
	}
}
