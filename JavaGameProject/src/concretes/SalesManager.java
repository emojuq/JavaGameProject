package concretes;

import abstracts.SalesService;
import entities.Gamer;
import entities.Games;

public class SalesManager implements SalesService {

	@Override
	public void buyGame(Gamer gamer, Games games) {
		System.out.println("Tebrikler " + gamer.getName() + " adl� ki�i " +
	    games.getGameName() + " adl� oyunu " + games.getGamePrice() +" TL'ye ba�ar�yla sat�n ald�.");
		
	}

	@Override
	public void giveBack(Gamer gamer, Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adl� oyunu " +
		gamer.getName() + " adl� kullan�c� ba�ar�yla iade etmi�tir. Oyunun fiyat� olan : "
		+ games.getGamePrice() + " hesab�n�za geri aktar�lm��t�r.!" );
				
		
	}

}
