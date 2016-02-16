package java_card;

public abstract class Card implements ICard, Comparable<Card>
{	
	protected CardSuit suit;
	protected CardRank rank;
	protected ICardGame game;
	
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
		return rank;
	}
	
	public CardSuit getSuit()
	{
		return suit;
	}
	
	public void setGame(ICardGame game)
	{
		this.game = game;
	}
	
	public abstract int compareTo(Card card);
}