package java_card;

public abstract class Card implements ICard, Comparable<Card>
{	
	private ICardSuit suit;
	private ICardRank rank;
	private ICardGame game;
	
	protected Card()
	{
	}
	
	public Card(ICardSuit suit, ICardRank rank, ICardGame game)
	{
		this.suit = suit;
		this.rank = rank;
		this.game = game;
	}
	
	public ICardRank getRank()
	{
		return this.rank;
	}
	
	public ICardSuit getSuit()
	{
		return this.suit;
	}
	
	public ICardGame getGame()
	{
		return this.game;
	}
	
	public abstract int compareTo(Card card);
}