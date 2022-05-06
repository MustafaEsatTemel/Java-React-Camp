package me.mustafaesattemel.northwing.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	//Asagidaki orneklerin hepsi birbirinin alternatifi
	//tum bilgileri geri dondurmek istersen 1. constructoru,
	//sadece datayi ve successi dondurmek istersen 2. ,
	//sadece mesaj dondurmek isteyebilirsin 3. .
	
	//Basarili bir data sonucu dondureceksen ve bunu mesajla suslemek istiyorsan bunu kullanabilirsin.
	public SuccessDataResult(T data, String message) {
		super(data,true,message);
	}

	//Sadece data ile calismak istiyorum
	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	//Sadece mesajla calisacam uleynn.
	public SuccessDataResult(String message) {
		super(null,true,message);
	}
	
	//sadece sonucu dondururum hic mesajla datayla ugrasamam kb.
	public SuccessDataResult() {
		super(null,true);
	}
	
}
