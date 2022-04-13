package me.mustafaesattemel.northwing.business.abstracts;

import java.util.List;

import me.mustafaesattemel.northwing.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();//Tum urunleri dondur.
}
