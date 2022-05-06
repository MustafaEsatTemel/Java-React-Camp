package me.mustafaesattemel.northwing.core.utilities.results;

public class ErrorResult extends Result {//Eger sonuc basarisiz ise burasi calissin yani :D

	public ErrorResult() { 
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
	}

	 
}
