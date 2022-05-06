package tr.mustafaesattemel.coffee.Business.Abstracts;

import tr.mustafaesattemel.coffee.DataAccess.Abstracts.CustomerDao;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

//2 firmaninda kaydetme islemi ayni , yani ikisi de ayni databaseyi kullanacak.
//Eger ikisinin databasesi ayni ise her firma icin ayni kodu yazmaya gerek yok,
//bu classimizi abstract yapiyoruz ve 2 firmamizin kodunu da buradan cekiyoruz :).
public abstract class BaseCustomerManager implements CustomerService {

	private CustomerDao cd;

	
	public BaseCustomerManager(CustomerDao cd) {
		this.cd = cd;
	}
	@Override
	public void save(Customer customer) {
		cd.save(customer);
		
	}

}
