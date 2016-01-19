package java_card;

import java.util.Collection;

public interface ICardPlayer
{
	public boolean getIsDealer();
	public void receive(Card card);
	public Card play(Collection<Card> played);
	public void seePlayedHand(Collection<Card> hand);
}
