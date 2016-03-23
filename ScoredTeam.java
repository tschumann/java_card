package java_card;

public abstract class ScoredTeam extends Team
{
	private int score;
	
	protected ScoredTeam()
	{
		// TODO: initialise stuff here too?
	}
	
	public ScoredTeam(int id, int maxPlayers)
	{
		this.score = 0;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	public void addToScore(int points)
	{
		this.score += points;
	}
}
