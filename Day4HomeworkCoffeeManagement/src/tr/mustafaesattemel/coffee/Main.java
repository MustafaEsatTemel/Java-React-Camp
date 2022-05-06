package tr.mustafaesattemel.coffee;

import tr.mustafaesattemel.coffee.Adapters.MernisServiceAdapter;
import tr.mustafaesattemel.coffee.Business.Abstracts.BaseCustomerManager;
import tr.mustafaesattemel.coffee.Business.Concretes.CustomerCheckManager;
import tr.mustafaesattemel.coffee.Business.Concretes.StarbucksCustomerManager;
import tr.mustafaesattemel.coffee.DataAccess.Concretes.EsatSQLCustomerDao;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager cm = new StarbucksCustomerManager
				(new EsatSQLCustomerDao(), new MernisServiceAdapter());
		
		Customer customer = new Customer();
		customer.setFirstName("Mustafa Esat");
		customer.setLastName("Temel");
		customer.setNationalityId("40573736364");
		customer.setYearOfBirthday(2002);
		
		cm.save(customer);
		
		
		
	}

}
