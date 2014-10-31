package de.memory.api;

public interface ICard {

	public boolean equals(Object o);
	public void flipCard();
	public boolean isFrontVisible();
	public String getFrontColor();
	
	//Card is in players box and cannot be chosen by another player anymore
	public void setCardUnplayable(boolean value);
	public boolean isCardUnplayable();
}
