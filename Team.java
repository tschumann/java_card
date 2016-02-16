package java_card;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Team implements ITeam
{
	protected int id;
	protected int maxPlayers;
	protected int wins;
	
	protected Collection<ICardPlayer> players;
	
	protected Team()
	{
		// TODO: should things be initialised here too in case?
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
		// TODO: is there a current length method in Collection?
		if (this.players.toArray().length == this.maxPlayers)
		{
			throw new Exception();
		}
		
		this.players.add(player);
	}
}