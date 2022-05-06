package me.mustafaesattemel.northwing.core.utilities.results;

public class DataResult<T> extends Result {

	private T data; //Genericler ile calismaya basladik. Cunku datamiz hersey olabilir,
	// urun olabilir , kategori olabilir , employee olabilir vb.
	
	public DataResult(T data,boolean success, String message) {
		super(success, message);//Base sinifin constructorunu cagirir.
		this.data=data;
	}

	public DataResult(T data,boolean success) {
		super(success);//Base sinifin constructorunu cagirir.
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}
