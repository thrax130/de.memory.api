package de.memory.api;

public interface IPlayer {
	
	public void flipCard(int index);
	public void collectPair();
	public boolean isActive();
	public int getAmountCardPairs();
	public int getPlayerNumber();
}
