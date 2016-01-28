package java_card;

public class Deck
{
	private ICardGame game;
	
	public Deck()
	{
	}
	
	public void setGame(ICardGame game)
	{
		this.game = game;
	}
	
	public ICardGame getGame()
	{
		return this.game;
	}
}
