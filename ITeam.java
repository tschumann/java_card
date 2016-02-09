package java_card;

public interface ITeam
{
	public int getWins();
	public void addWin();
	public void addPlayer(ICardPlayer player) throws Exception;
}
