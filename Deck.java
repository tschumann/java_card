package java_card;

import java.util.ArrayList;

public class Deck
{
	private ICardGame game;
	private ArrayList<ICard> deck;
	
	public Deck(boolean includeJokers)
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
	
	/*
	 * How many cards there in the deck
	 */
	public int count()
	{
		return deck.size();
	}
}
