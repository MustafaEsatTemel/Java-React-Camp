package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {

		//Ileride spring IoC ile asagidaki entityler haric newleme sorununu cozeceksin.
		ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter());
		
		//Product product = new Product(1,1,"elma",12,50); 1 kategori id'li urunu ekleyemezsin ProductManagerden hatirla
		Product product = new Product(1,2,"elma",12,50);
		
		productService.add(product);

	}

}
