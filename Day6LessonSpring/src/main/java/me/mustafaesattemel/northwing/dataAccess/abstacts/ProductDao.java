package me.mustafaesattemel.northwing.dataAccess.abstacts;

import org.springframework.data.jpa.repository.JpaRepository;

import me.mustafaesattemel.northwing.entities.concretes.Product;
//JpaRepository'i extends ediyoruz, ve generic bolumundeki ilk elemana
//class'in isminden de anlasilacagi gibi Product nesnesi ile calisacagiz diyoruz.
//Ardindan 2. parametreye ise Integer diyoruz , veri tabanindaki(Product) primary key integer.
//veee sonunda artik crud operasyonlarimiz hazir. Otomatik olusturuyor bu :d.
public interface ProductDao extends JpaRepository<Product, Integer>{

}
