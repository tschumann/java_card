package java_card;

import java.util.Collection;

public abstract class CardGame implements ICardGame
{
	private Deck deck;
	private Collection<ICardPlayer> players;
}
