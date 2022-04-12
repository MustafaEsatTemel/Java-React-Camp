package gameExample.Concrete;

import gameExample.Abstract.ICampaignService;
import gameExample.Entity.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void startCampaign(Campaign campaign) {
		System.out.println("Indirim basladi, indirim tutari :%"+ campaign.getDiscount());
		
	}

}
