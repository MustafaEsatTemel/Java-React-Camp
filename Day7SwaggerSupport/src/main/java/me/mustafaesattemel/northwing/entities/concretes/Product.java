package me.mustafaesattemel.northwing.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //-> anotasyonu ile lombok sayesinde getter ve setterler hazir gelmekte.
@AllArgsConstructor //Tum field'leri iceren bir constructor olustur.
@NoArgsConstructor //Parametresiz constructorumuzu da getir.
@Entity //Sen bir veri tabani nesnesisin.
@Table(name="products") //veri tabaninda bu class'ın karsiligi products tablosudur.
public class Product {

	@Id//Veri tabanimizdaki primaryKey'imiz(id) budur.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id nasil uretilsin ? Stratejimiz bir bir artirmak olacak(Identity).
	@Column(name="product_id") //veri tabaninda sutunu product_id olan. 
	private int id; 		//veri tabaninda, bu field'in karsiligi(sutunu) yukarida belirttigim anotasyon ile yapilmakta.
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	


	
	
	
	
	
}
