package me.mustafaesattemel.northwing.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.mustafaesattemel.northwing.business.abstracts.ProductService;
import me.mustafaesattemel.northwing.entities.concretes.Product;

@RestController//Sen bir controllersin.
@RequestMapping("/api/products")//Ornek vermek gerekirse domainin/api/products'a bir istek gelirse, onun cevabini verecek arkadas Productscontroller
public class ProductsController {
	
	//sen bunun tepesine hic constructor yazmadan @Autowired desen yine calisir.
	//Fakat birden fazla servisle calisacagin zaman hepsinin tepesine yazman gerekir.
	//Onun yerine direkt constructor'un ustune yaziyoruz oldu bitti.
	private ProductService productService;
	
	
	//Product service'yi implemente eden keratayi bulmak benim gorevim.
	//Biz normalde buraya nesneyi nasil yolluyorduk, main'e gidiyorduk
	//ProductManager pm = new ProductManager(); yapi bu nesneyi veriyorduk ya,
	//autowired bunu bizim icin yapiyor.
	@Autowired
	public ProductsController(ProductService productService) {
		this.productService=productService;
	}
	
	//Frontend , backend'e istekte bulunur. Birisi bana veri ver demek(GetMapping), digeri de su veriyi degistir demek(). Bunlara HTTP requestleri deniyor.
	@GetMapping("/getall")//domainin/api/products/getall'a istekte bulunursan asagidaki method calisacak.
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
