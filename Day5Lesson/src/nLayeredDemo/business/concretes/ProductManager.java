package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	//Dependency injection ile bagimliligimizi en aza indirdik, yani yarin birgun hibernate yerine baska bir
	//sisteme gecis yapmak istersek, onu da productDao'dan implemente ederiz ve buraya onu da yollayabiliriz.
	
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		this.productDao= productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmemekte. Lütfen daha sonra tekrar denemeyiniz.");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
