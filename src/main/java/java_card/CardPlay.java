package java_card;

public class CardPlay
{
	protected ICardPlayer player;
	protected ICard card;

	protected CardPlay()
	{
	}
	
	/*
	 * A class representing a what a player has played in a round
	 */
	public CardPlay(ICardPlayer player, ICard card)
	{
		this.player = player;
		this.card = card;
	}
	
	public ICardPlayer getPlayer()
	{
		return player;
	}
	
	public ICard getCard()
	{
		return this.card;
	}
}
