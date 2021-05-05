package concretes;

import abstracts.SalesService;
import entities.Gamer;
import entities.Games;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(Gamer gamer, Games games) {
		System.out.println("Tebrikler " + gamer.getName() + " adlý kiþi " +
	    games.getGameName() + " adlý oyunu " + games.getGamePrice() +" TL'ye baþarýyla satýn aldý.");
		
	}

	@Override
	public void giveBack(Gamer gamer, Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adlý oyunu " +
		gamer.getName() + " adlý kullanýcý baþarýyla iade etmiþtir. Oyunun fiyatý olan : "
		+ games.getGamePrice() + " hesabýnýza geri aktarýlmýþtýr.!" );
				
		
	}

}
