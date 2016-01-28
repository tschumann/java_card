package java_card;

public class CardGame implements ICardGame
{
	private Deck deck;
	
	public CardGame()
	{
		deck = new Deck();
		deck.setGame(this);
	}
}
