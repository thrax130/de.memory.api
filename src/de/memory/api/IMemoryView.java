package de.memory.api;

public interface IMemoryView {
	public final static String TYPE_PROPERTY = "de.memory.view.TYPE";

    void update(IMemoryModel t);
    void startNewGame();
}
