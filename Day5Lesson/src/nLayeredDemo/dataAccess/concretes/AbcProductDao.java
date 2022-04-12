package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
//Yarin birgun hibernate'den daha iyi bir sistem gelirse boyle kolay bir sekilde o sistemi de projemize entegre edebiliriz.
public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Abc ile eklendi : "+product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
