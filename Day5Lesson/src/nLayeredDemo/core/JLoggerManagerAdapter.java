package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

//Burada JloggerManagerAdapter ile yabancinin logger sistemini sistemimize tam bagimli olmayacak sekilde
//entegre ediyoruz.
public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
		
	}

}
