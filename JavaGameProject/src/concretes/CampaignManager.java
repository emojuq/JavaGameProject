package concretes;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Games;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adlý kampanyanýz sisteme baþarýyla eklenmiþtir! ");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adlý kampanyanýz sistemde baþarýyla güncellenmiþtir! ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adlý kampanyanýz sistemden baþarýyla silinmiþtir! ");
		
	}

	@Override
	public void buyWithCampaign(Campaign campaign, Games games) {
		double newPrice = games.getGamePrice() - ((games.getGamePrice()* campaign.getDiscount()/ 100));
		System.out.println(games.getGameName() + " oyununa, " + campaign.getCampaignName() + " kampanyasi uygulandi. Bu indirimle birlikte  " + games.getGamePrice() + " TL olan fiyatý " + String.format("%.2f TL oldu", newPrice));
		
	}

}
