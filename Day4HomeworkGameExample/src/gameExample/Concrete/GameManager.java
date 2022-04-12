package gameExample.Concrete;

import gameExample.Abstract.ICampaignService;
import gameExample.Abstract.IGameService;
import gameExample.Entity.Campaign;
import gameExample.Entity.Game;

public class GameManager implements IGameService {

	Campaign kampanya;
	public GameManager(Campaign kampanya) {
		this.kampanya = kampanya;
	}
	
	@Override
	public void add(Game game) {
		if(kampanya.getDiscount()>0) {
			double kampanyaHesap;
			kampanyaHesap = (game.getGamePrice()*kampanya.getDiscount()/100);
			System.out.println("Kampanyalý ücret :" + kampanyaHesap);
		}
		System.out.println("Oyun eklendi : "+ game.getGamePrice()+"TL");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun guncellendi : "+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : "+ game.getGameName());
		
	}

}
