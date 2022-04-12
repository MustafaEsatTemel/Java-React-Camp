package gameExample.Concrete;

import gameExample.Abstract.IGamerCheckService;
import gameExample.Entity.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealGamer(Gamer gamer) {
		
		//Yarin birgun merniste hata cikarsa testlerini bu ile gerceklesitebilirsin
		return true;
		}
 

	}


