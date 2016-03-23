package java_card;

public abstract class Card implements ICard, Comparable<Card>
{	
	private CardSuit suit;
	private CardRank rank;
	private ICardGame game;
	
	protected Card()
	{
	}
	
	public Card(CardSuit suit, CardRank rank, ICardGame game)
	{
		this.suit = suit;
		this.rank = rank;
		this.game = game;
	}
	
	public CardRank getRank()
	{
		return this.rank;
	}
	
	public CardSuit getSuit()
	{
		return this.suit;
	}
	
	public ICardGame getGame()
	{
		return this.game;
	}
	
	public abstract int compareTo(Card card);
}