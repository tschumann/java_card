package java_card;

public abstract class ScoredTeam extends Team
{
	private int score;
	
	public ScoredTeam(int id, int maxPlayers)
	{
		super(id, maxPlayers);
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
