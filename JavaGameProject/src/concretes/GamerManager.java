package concretes;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimize ba�ar�yla kay�t oldunuz!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimizdeki bilgilerin ba�ar�yla g�ncellendi!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Tebrikler " + gamer.getName() + " sistemimizdeki hesab�n�z ba�ar�yla silindi!");
		
	}

}
