package nLayeredDemo.core;

//Suan baskasinin paketini(jLogger) sistemimize entegre ediyoruz, fakat tam bagimli olmamak icin core
//katmanina bir LoggerService interfacesi aciyoruz.
public interface LoggerService {

	void logToSystem(String message);
	
}
