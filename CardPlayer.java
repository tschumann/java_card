package java_card;

import java.util.ArrayList;
import java.util.Collection;

public abstract class CardPlayer implements ICardPlayer
{
	private Collection<ICard> hand;
	private boolean isDealer;
	
	public CardPlayer()
	{
		this.hand = new ArrayList<ICard>();
		this.isDealer = false;
	}
	
	public boolean getIsDealer()
	{
		return this.isDealer;
	}
	
	public void setIsDealer(boolean isDealer)
	{
		this.isDealer = isDealer;
	}
	
	public void receive(ICard card)
	{
		hand.add(card);
	}
	
	public Collection<ICard> getHand()
	{
		return new ArrayList<ICard>(this.hand);
	}
}
