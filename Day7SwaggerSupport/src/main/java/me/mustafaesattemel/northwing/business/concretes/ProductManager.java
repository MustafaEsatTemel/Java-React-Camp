package me.mustafaesattemel.northwing.business.concretes;

import java.util.List;

//Java'da bean gorursen class demek.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.mustafaesattemel.northwing.business.abstracts.ProductService;
import me.mustafaesattemel.northwing.core.utilities.results.DataResult;
import me.mustafaesattemel.northwing.core.utilities.results.Result;
import me.mustafaesattemel.northwing.core.utilities.results.SuccessDataResult;
import me.mustafaesattemel.northwing.core.utilities.results.SuccessResult;
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
	
//	@Override
//	public List<Product> getAll() {
//		// TODO Auto-generated method stub
//		return this.productDao.findAll();//Tum datalari getir ulen.
//	}Eskiden bunu kullaniyorduk fakat product servicedeki degisiklikten sonra alttaki method devreye giriyor.

	
	//Asagidaki olayda basarili bir sonuc dondurmusuz, ee hadi hatali bir sonuc olursa 
	//diye dusunmus olabilirsin. Onu ileride AOP ile gerekli hata yonetimlerini yaparak cozecegiz
	//Yani sen soyle dusunmus olabilirsin try'a alalım dogruysa succes dondursun hata varsa catch'den alip
	//errordataresult dondursun gibi dusunmus olabilirsin. Bu sektorde kullanilan yanlis bir yontemdir.
	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll()
				,"Data listelendi");
				
	}

	//Urun ekleme islemimizi de gerceklestirdik.
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}
	
}
