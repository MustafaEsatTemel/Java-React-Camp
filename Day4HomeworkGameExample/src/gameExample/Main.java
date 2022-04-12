package gameExample;

import gameExample.Adapters.MernisServiceAdapter;
import gameExample.Concrete.CampaignManager;
import gameExample.Concrete.GameManager;
import gameExample.Concrete.GamerManager;
import gameExample.Entity.Campaign;
import gameExample.Entity.Game;
import gameExample.Entity.Gamer;

public class Main {
	
	public static void main(String[] args) {
	
		Gamer gamer = new Gamer();
		gamer.setAge(18);
		gamer.setEmail("esattemel130@gmail.com");
		gamer.setNick("esat179");
		
		GamerManager gm = new GamerManager(new MernisServiceAdapter());
		gm.add(gamer);
		
		Campaign kampanya = new Campaign();
		kampanya.setDiscount(0);
		CampaignManager cm = new CampaignManager();
		cm.startCampaign(kampanya);
	
		Game mario = new Game();
		mario.setGameName("mario");
		mario.setGamePrice(100);
		
		GameManager gameManager = new GameManager(kampanya);
		gameManager.add(mario);
	}	
	
}
