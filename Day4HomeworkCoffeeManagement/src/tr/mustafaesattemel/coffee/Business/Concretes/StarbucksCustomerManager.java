package tr.mustafaesattemel.coffee.Business.Concretes;

import tr.mustafaesattemel.coffee.Business.Abstracts.BaseCustomerManager;
import tr.mustafaesattemel.coffee.Business.Abstracts.CustomerCheckService;
import tr.mustafaesattemel.coffee.DataAccess.Abstracts.CustomerDao;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService cs ;
	
	
	public StarbucksCustomerManager(CustomerDao cd,CustomerCheckService cs) {
		super(cd);
		this.cs = cs;
	}
	@Override
	public void save(Customer customer) {
		if(cs.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
	}


}
