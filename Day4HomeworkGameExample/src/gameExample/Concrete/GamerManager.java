package gameExample.Concrete;

import gameExample.Abstract.IGamerCheckService;
import gameExample.Abstract.IGamerService;
import gameExample.Entity.Gamer;

public class GamerManager implements IGamerService{

	private IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	


	
	@Override
	public void add(Gamer gamer) {
				if(gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("hatali giris bilgileri");
		}
	
	}
		

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : "+gamer.getNick());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : "+gamer.getNick());
		
	}


}
