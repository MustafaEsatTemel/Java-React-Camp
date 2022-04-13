package me.mustafaesattemel.northwing.business.concretes;

import java.util.List;

//Java'da bean gorursen class demek.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mustafaesattemel.northwing.business.abstracts.ProductService;
import me.mustafaesattemel.northwing.dataAccess.abstacts.ProductDao;
import me.mustafaesattemel.northwing.entities.concretes.Product;

@Service//Sen benim is sinifimsin
public class ProductManager implements ProductService {
	//ProductDao injection'u yapiyoruz. ProductDao bir interface , onun extends ettigi JpaRepository'de bir
	//interface, Yani burada bir class yok. ProductDao turunden bir class yollayamiyoruz yani :D.
	//Bu olayi spring otomatik arkada yapacak, ornek vermek gerekirse :
	//HibernateProductDao olusturacak onu ProductDao dan implemente edecek ve geri bize verecek.
	//Bu olayi ise @Autowired anotasyonu ile yapiyoruz.
	//@Autowired bunun tepesinde olsaydi da calisirdi. Fakat baska bir servis de eklemek isteyebilirdin
	//oyuzden direkt constructor injectionla islemimizi gerceklestirdik, yani onuun ustune Autowired yazdik.
	private ProductDao productDao;
	
				//Spring arka planda asagidaki ProductDao'ya karsilik gelebilecek,
	@Autowired	//instance'si olabilecek bir sinifi uretiyor ve buraya veriyor.
	public ProductManager(ProductDao productDao) {
		this.productDao=productDao;
	}
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();//Tum datalari getir ulen.
	}

}
