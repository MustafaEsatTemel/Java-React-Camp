package tr.mustafaesattemel.coffee.Adapters;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.mustafaesattemel.coffee.Business.Abstracts.CustomerCheckService;
import tr.mustafaesattemel.coffee.Entities.Concretes.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
					, customer.getFirstName().toUpperCase()
					, customer.getLastName().toUpperCase()
					,customer.getYearOfBirthday());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
