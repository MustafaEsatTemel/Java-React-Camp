package me.mustafaesattemel.northwing.core.utilities.results;

public class Result {

	private boolean success;
	private String message;
	
	//Sonucu sadece basarili veyahut basarisiz seklinde gormek isteyebiliriz.
	public Result(boolean success) {
		this.success=success;	}
	
	//Sonucu basarili ve basarisiz'e ilaveten, mesaj yollamak da isteyebiliriz.
	public Result(boolean success,String message) {
		this(success);//yukaridaki tek parametreli constructora bunu yolla.
		this.message=message;
		
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
		
	}
	
	
}
