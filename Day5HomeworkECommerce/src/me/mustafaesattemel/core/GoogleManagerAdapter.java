package me.mustafaesattemel.core;

import me.mustafaesattemel.googleService.GoogleManager;

public class GoogleManagerAdapter implements LoggerService {

	@Override
	public void log(String message) {
		GoogleManager gm = new GoogleManager();
		gm.add(message);
		
	}

}
