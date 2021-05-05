package concretes;

import abstracts.CampaignService;
import entities.Campaign;
import entities.Games;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adl� kampanyan�z sisteme ba�ar�yla eklenmi�tir! ");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adl� kampanyan�z sistemde ba�ar�yla g�ncellenmi�tir! ");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Tebrikler " + campaign.getCampaignName() + " adl� kampanyan�z sistemden ba�ar�yla silinmi�tir! ");
		
	}

	@Override
	public void buyWithCampaign(Campaign campaign, Games games) {
		double newPrice = games.getGamePrice() - ((games.getGamePrice()* campaign.getDiscount()/ 100));
		System.out.println(games.getGameName() + " oyununa, " + campaign.getCampaignName() + " kampanyasi uygulandi. Bu indirimle birlikte  " + games.getGamePrice() + " TL olan fiyat� " + String.format("%.2f TL oldu", newPrice));
		
	}

}
