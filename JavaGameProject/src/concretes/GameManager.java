package concretes;

import abstracts.GameService;
import entities.Games;

public class GameManager implements GameService {

	@Override
	public void add(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adl� oyununuz sisteme ba�ar�yla eklenmi�tir!");
		
	}

	@Override
	public void update(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adl� oyununuz sistemde ba�ar�yla g�ncellenmi�tir!");
		
	}

	@Override
	public void delete(Games games) {
		System.out.println("Tebrikler " + games.getGameName() + " adl� oyununuz sistemden ba�ar�yla silinmi�tir!");
		
	}

}
