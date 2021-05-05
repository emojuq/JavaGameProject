package concretes;

import abstracts.GameService;
import entities.Games;

public class GameManager implements GameService {

	@Override
	public void add(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adlý oyununuz sisteme baþarýyla eklenmiþtir!");
		
	}

	@Override
	public void update(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adlý oyununuz sistemde baþarýyla güncellenmiþtir!");
		
	}

	@Override
	public void delete(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adlý oyununuz sistemden baþarýyla silinmiþtir!");
		
	}

}
