package tr.mustafaesattemel.coffee.DataAccess.Concretes;

import tr.mustafaesattemel.coffee.DataAccess.Abstracts.CustomerDao;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public class EsatSQLCustomerDao implements CustomerDao{


	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db" + customer.getFirstName());
		
	}

}
