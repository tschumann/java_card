package java_card;

import java.util.List;

public interface ICardPlayer
{
	public boolean getIsDealer();
	public void setIsDealer(boolean isDealer);
	public void receive(ICard card);
	public ICard play(List<CardPlay> played);
	public void seePlayedCards(List<CardPlay> played);
}
