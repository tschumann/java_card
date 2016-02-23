package java_card;

public abstract class CardTeamPlayer extends CardPlayer
{
	protected Team team;
	
	public CardTeamPlayer(Team team)
	{
		this.team = team;
	}
	
	public void setTeam(Team team)
	{
		this.team = team;
	}

	public Team getTeam()
	{
		return this.team;
	}
}
