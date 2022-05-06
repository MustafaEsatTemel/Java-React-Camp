package tr.mustafaesattemel.coffee.Business.Concretes;

import tr.mustafaesattemel.coffee.Business.Abstracts.CustomerCheckService;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
	}

}
