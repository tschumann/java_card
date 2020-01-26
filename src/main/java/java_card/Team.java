package java_card;

import java.util.ArrayList;
import java.util.List;

public abstract class Team implements ITeam
{
	private int id;
	private int maxPlayers;
	private int wins;
	
	protected List<ICardPlayer> players;
	
	protected Team()
	{
	}
	
	public Team(int id, int maxPlayers)
	{
		this.id = id;
		this.wins = 0;
		this.maxPlayers = maxPlayers;
		this.players = new ArrayList<ICardPlayer>(this.maxPlayers);
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getWins()
	{
		return this.wins;
	}
	
	public void addWin()
	{
		this.wins++;
	}
	
	public void addPlayer(ICardPlayer player) throws Exception
	{
		if (this.players.size() == this.maxPlayers)
		{
			throw new Exception("Too many players added");
		}
		
		this.players.add(player);
	}

	public List<ICardPlayer> getPlayers()
	{
		return this.players;
	}
	
	public boolean equals(Object obj)
	{
		return ((Team)obj).getId() == this.id;
	}
}
