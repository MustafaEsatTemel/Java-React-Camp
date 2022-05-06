package tr.mustafaesattemel.coffee.Entities.Concretes;

import java.time.Year;

import tr.mustafaesattemel.coffee.Entities.Abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirthday;
	private String nationalityId;
	
	
	
	public Customer() {
	}
	
	public Customer(int id, String firstName, String lastName, int yearOfBirthday, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirthday = yearOfBirthday;
		this.nationalityId = nationalityId;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearOfBirthday() {
		return yearOfBirthday;
	}
	public void setYearOfBirthday(int yearOfBirthday) {
		this.yearOfBirthday = yearOfBirthday;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}
