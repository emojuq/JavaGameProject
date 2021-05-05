package abstracts;

import entities.Campaign;
import entities.Games;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void buyWithCampaign(Campaign campaign, Games games);
}
