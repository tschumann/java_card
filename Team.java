package java_card;

public abstract class Team implements ITeam
{
	protected int wins;
	
	public Team()
	{
		this.wins = 0;
	}
	
	public int getWins()
	{
		return this.wins;
	}
}
