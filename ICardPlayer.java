package java_card;

import java.util.Collection;

public interface ICardPlayer
{
	public boolean getIsDealer();
	public void receive(ICard card);
	public ICard play(Collection<ICard> played);
	public void seePlayedHand(Collection<ICard> hand);
}
