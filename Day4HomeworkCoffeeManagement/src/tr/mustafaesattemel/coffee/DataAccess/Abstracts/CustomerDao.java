package tr.mustafaesattemel.coffee.DataAccess.Abstracts;

import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public interface CustomerDao {

	void save(Customer customer);
}
