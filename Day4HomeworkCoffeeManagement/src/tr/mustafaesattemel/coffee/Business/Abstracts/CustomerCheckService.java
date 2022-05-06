package tr.mustafaesattemel.coffee.Business.Abstracts;

import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

//Simdilik sadece starbucks mernis dogrulamasi istiyor. Fakat yarin birgun hadi nero da isterse ?
public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
	
}
