import java.time.LocalDate;

import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import concretes.SalesManager;
import entities.Campaign;
import entities.Gamer;
import entities.Games;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer= new Gamer(1,"Emre","Aydýn",LocalDate.of(2002, 8,27),"1111");
		GamerManager gamerManager= new GamerManager();
		gamerManager.add(gamer);
		
		
		System.out.println("---------------------------------");
		
		Games games1 = new Games(1,"CS GO",80);
		Games games2= new Games(2,"PUBG",75);
		Games games3 = new Games(3,"VALORANT",10);
		
		GameManager gameManager= new GameManager();
		gameManager.add(games1);
		gameManager.delete(games2);
		gameManager.update(games3);
		
		
		System.out.println("-----------------------------------");
		
		Campaign campaign1= new Campaign(1,"Yýlbaþý Ýndirimi",12.5);
		Campaign campaign2= new Campaign(2,"10. Yýl Ýndirimi",21.5);
		Campaign campaign3 = new Campaign(3,"Yaz Ayý Ýndirimi",35);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign3);
		campaignManager.buyWithCampaign(campaign2, games1);
		
		
		System.out.println("-------------------------------------");
		
		SalesManager salesManager = new SalesManager();
		salesManager.buyGame(gamer, games2);
		salesManager.giveBack(gamer, games1);
		
	
	}

}
