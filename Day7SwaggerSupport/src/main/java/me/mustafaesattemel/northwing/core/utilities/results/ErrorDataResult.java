package me.mustafaesattemel.northwing.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	//Asagidaki orneklerin hepsi birbirinin alternatifi
	//tum bilgileri geri dondurmek istersen 1. constructoru,
	//sadece datayi ve erroru dondurmek istersen 2. ,
	//sadece mesaj dondurmek isteyebilirsin 3. .
	
	//Aklina errordataresult'a data olarak ne gonderebiliriz ki gelmis olabilir.
	//Sonucta burasi datayla ilgili sikinti oldugunda calisacak olan kisim.
	//Suanlik data almayan kisimlari da var onlari kullanabilirsin diyeyim, bu olay frontendle ilgili.
	//Sen frontendcinin sistem cokmesin diye bos bir sablon vb gonderebilirsin.
	
	//Basarisiz bir data sonucu dondureceksen ve bunu mesajla suslemek istiyorsan bunu kullanabilirsin.
	public ErrorDataResult(T data, String message) {
		super(data,false,message);
	}

	//Sadece data ile calismak istiyorum
	public ErrorDataResult(T data) {
		super(data,false);
	}
	
	//Sadece mesajla calisacam uleynn.
	public ErrorDataResult(String message) {
		super(null,false,message);
	}
	
	//sadece sonucu dondururum hic mesajla datayla ugrasamam kb.
	public ErrorDataResult() {
		super(null,false);
	}
	
}