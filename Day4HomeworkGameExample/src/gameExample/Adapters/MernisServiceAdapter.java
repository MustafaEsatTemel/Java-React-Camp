package gameExample.Adapters;

import gameExample.Abstract.IGamerCheckService;
import gameExample.Entity.Gamer;


public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
	
		return gamer.getNick()=="esat179" && gamer.getEmail()=="esattemel130@gmail.com" && gamer.getAge() == 18;
	}

	
}
