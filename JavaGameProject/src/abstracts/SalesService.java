package abstracts;

import entities.Gamer;
import entities.Games;

public interface SalesService {
	void buyGame(Gamer gamer,Games games);
	void giveBack(Gamer gamer,Games games);
}
