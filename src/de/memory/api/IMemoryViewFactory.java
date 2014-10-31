package de.memory.api;

import java.util.Properties;

public interface IMemoryViewFactory {
	IMemoryView createView(IMemoryModel model);

    Properties getProperties();
}
