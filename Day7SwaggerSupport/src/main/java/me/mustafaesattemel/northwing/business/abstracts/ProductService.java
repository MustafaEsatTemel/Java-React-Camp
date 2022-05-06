package me.mustafaesattemel.northwing.business.abstracts;

import java.util.List;

import me.mustafaesattemel.northwing.core.utilities.results.DataResult;
import me.mustafaesattemel.northwing.core.utilities.results.Result;
import me.mustafaesattemel.northwing.entities.concretes.Product;

public interface ProductService {
	// List<Product> getAll();//Tum urunleri dondur. eskiden bunu yapiyorduk, fakat hadi hata varsa datalarda ?
	
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
