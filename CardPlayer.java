package java_card;

import java.util.ArrayList;
import java.util.Collection;

public abstract class CardPlayer implements ICardPlayer
{
	protected Collection<Card> hand;
	
	public CardPlayer()
	{
		this.hand = new ArrayList<Card>();
	}
	
	public void receive(Card card)
	{
		hand.add(card);
	}
}
