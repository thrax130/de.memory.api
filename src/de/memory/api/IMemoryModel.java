package de.memory.api;

public interface IMemoryModel {

	void startNewGame();
	
	ICard getCard(int index);
	
	IPlayer getPlayer(int number);
	IPlayer getActivePlayer();
	IPlayer getWinner();
	
	void addView(IMemoryView view);
	void removeView(IMemoryView view);
}
