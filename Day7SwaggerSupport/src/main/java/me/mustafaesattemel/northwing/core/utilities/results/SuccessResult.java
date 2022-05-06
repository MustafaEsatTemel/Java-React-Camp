package me.mustafaesattemel.northwing.core.utilities.results;

public class SuccessResult extends Result {//Eger sonuc basarili ise burasi calissin yani :D

	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
	super(true,message);
	}
	
}
