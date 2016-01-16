package deck;

public abstract class Card
{	
	protected CardSuit suit;
	protected CardRank rank;
	
	protected Card()
	{
	}
	
	public Card(CardSuit suit, CardRank rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public CardRank getRank()
	{
		return rank;
	}
	
	public CardSuit getSuit()
	{
		return suit;
	}
}