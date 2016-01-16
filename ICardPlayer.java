package deck;

import java.util.ArrayList;

public interface ICardPlayer
{
	public boolean getIsDealer();
	public void receive(Card card);
	public Card play(ArrayList<Card> played);
	public void seePlayedHand(ArrayList<Card> hand);
}
